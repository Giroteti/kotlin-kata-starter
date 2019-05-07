package example

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.assertEquals
import org.junit.Test

class ExampleTestSuite {
    @Test
    fun exampleTest() {
        assertThat(getGreeting()).isEqualTo("Hello, world!")
    }
}
