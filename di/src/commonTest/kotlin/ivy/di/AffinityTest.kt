package ivy.di

import io.kotest.matchers.shouldBe
import ivy.di.Di.register
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
}