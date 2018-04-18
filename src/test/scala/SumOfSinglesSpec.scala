import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "sumOfNumbers" when {

    "called will add '1,2,3,4,5,6,7'" should {
      "return '28'" in {
        SumOfSingles.sumOfNumbers(List(4,5,7,5,4,8)) mustBe 15
      }
    }

    "called will remove duplicate numbers '1,2,1,1,6,2'" should {
      "return '6'" in {
        SumOfSingles.sumOfNumbers(List( 2, 1, 1, 6, 2)) mustBe 6
      }
    }

    "called will remove duplicate numbers '1,1,2,2,3,3,4,5'" should {
      "return '9'" in {
        SumOfSingles.sumOfNumbers(List(1,1,2,2,3,3,4,5)) mustBe 9
      }
    }
  }
}
