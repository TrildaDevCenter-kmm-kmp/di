package ivy.di

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import ivy.di.Di.register
import ivy.di.autowire.autoWire
import ivy.di.autowire.autoWireSingleton
import ivy.di.testsupport.FakeStateHolder
import kotlin.test.BeforeTest
import kotlin.test.Test

class AffinityTest {

    @BeforeTest
    fun setup() {
        Di.reset()
    }

    @Test
    fun gets_without_affinity() {
        // Given
        Di.featureScope {
            register { "Hello" }
        }

        // When
        val str = Di.get<String>()

        // Then
        str shouldBe "Hello"
    }

    @Test
    fun gets_with_affinity() {
        // Given
        Di.appScope {
            register { "app" }
        }
        Di.featureScope {
            register { "feature" }
        }

        // When
        val fromAppScope = Di.get<String>(affinity = AppScope)
        val fromFeatureScope = Di.get<String>(affinity = FeatureScope)

        // Then
        fromAppScope shouldBe "app"
        fromFeatureScope shouldBe "feature"
    }

    @Test
    fun get_throws_for_not_registered_classes() {
        // When
        val thrownException = shouldThrow<DependencyInjectionError> {
            Di.get<FakeStateHolder>(affinity = FeatureScope)
        }

        // Then
        thrownException.message.shouldNotBeNull()
    }

    @Test
    fun getLazy_throws_for_not_registered_classes() {
        // When
        val thrownException = shouldThrow<DependencyInjectionError> {
            Di.getLazy<FakeStateHolder>(affinity = FeatureScope)
        }

        // Then
        thrownException.message.shouldNotBeNull()
    }

    @Test
    fun affinity_autoWire() {
        // Given
        Di.appScope { register { "app" } }
        Di.featureScope { register { "feature" } }
        Di.appScope { autoWire(::Screen) }
        Di.featureScope { autoWire(::Screen) }

        // When
        val appScreen = Di.get<Screen>(affinity = AppScope)
        val featureScope = Di.get<Screen>(affinity = FeatureScope)

        // Then
        appScreen.name shouldBe "app"
        featureScope.name shouldBe "feature"
    }

    @Test
    fun affinity_autoWireSingleton() {
        // Given
        Di.appScope {
            register { "app" }
            autoWireSingleton(::Screen)
        }
        Di.featureScope {
            register { "feature" }
            autoWireSingleton(::Screen)
        }

        // When
        val appScreen = Di.get<Screen>(affinity = AppScope)
        val featureScope = Di.get<Screen>(affinity = FeatureScope)

        // Then
        withClue("App screen") {
            appScreen.name shouldBe "app"
            withClue("should be single instance") {
                Di.get<Screen>(affinity = AppScope) shouldBe appScreen
            }
        }
        withClue("Feature screen") {
            featureScope.name shouldBe "feature"
            withClue("should be single instance") {
                Di.get<Screen>(affinity = FeatureScope) shouldBe featureScope
            }
        }
    }

    @Test
    fun builds_complex_screen() {
        // Given
        Di.appScope {
            register<Int> { 42 }
            register { "Global" }
        }
        val screenScope = Di.newScope("my-screen")
        Di.inScope(screenScope) {
            register { "My Screen" }
            autoWire(::ComplexScreen)
        }

        // When
        val screen = Di.get<ComplexScreen>(affinity = screenScope)

        // Then
        screen shouldBe ComplexScreen(
            name = "My Screen",
            int = 42,
        )
    }

    @Test
    fun overwrites_dependency_with_affinity() {
        // Give
        Di.appScope {
            register { "global" }
        }
        Di.featureScope {
            register { "old" }
            register { "new" }
        }

        // When
        val appScope = Di.get<String>(affinity = AppScope)
        val featureScope = Di.get<String>(affinity = FeatureScope)

        // Then
        appScope shouldBe "global"
        featureScope shouldBe "new"
    }

    data class ComplexScreen(val name: String, val int: Int)
    data class Screen(val name: String)
}