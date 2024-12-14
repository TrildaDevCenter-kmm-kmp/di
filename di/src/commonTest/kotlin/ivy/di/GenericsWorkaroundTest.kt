package ivy.di

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import ivy.di.Di.register
import kotlin.jvm.JvmInline
import kotlin.test.BeforeTest
import kotlin.test.Test

class GenericsWorkaroundTest {

    @BeforeTest
    fun setup() {
        Di.reset()
    }

    @Test
    fun pre_workaround_behavior() {
        // Given
        Di.appScope {
            register { Container(42) }
            register { Container("hello") }
        }

        // When
        val intContainer = Di.get<Container<Int>>()
        val stringContainer = Di.get<Container<String>>()

        // Then
        intContainer.value.shouldBeInstanceOf<String>() // very weird, indeed!
        shouldThrow<ClassCastException> {
            intContainer.value + 1
        }
        stringContainer.value shouldBe "hello"
    }

    @Test
    fun workaround_is_working() {
        // Given
        Di.appScope {
            register { IntContainer(Container(42)) }
            register { StringContainer(Container("hello")) }
        }

        // When
        val intContainer = Di.get<IntContainer>().value
        val stringContainer = Di.get<StringContainer>().value

        // Then
        intContainer.value shouldBe 42
        stringContainer.value shouldBe "hello"
    }

    class Container<T>(val value: T)

    @JvmInline
    value class IntContainer(val value: Container<Int>)

    @JvmInline
    value class StringContainer(val value: Container<String>)
}