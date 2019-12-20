package hiker   // Don't change this package

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

// Don't change this class name
class HikerTest : StringSpec() {
    
    init {
        "Example Test" {
            hiker.answer() shouldBe 42
        }
        
        "Other example test" {
            "a" shouldNotBe "b"
        }
    }
}
