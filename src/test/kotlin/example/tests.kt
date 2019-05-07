package example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MyTests : StringSpec({
    "Greetings should be Hello, world!" {
        getGreeting() shouldBe("Hello, world!")
    }
})