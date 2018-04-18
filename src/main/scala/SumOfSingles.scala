object SumOfSingles extends App {

  def sumOfNumbers(list: List[Int]): Int = {


    val singleList = list.distinct
    println(singleList)

    val filteredDoubles = list.diff(singleList).sum *2
    println(filteredDoubles)

    val fullList = list.sum
    println(fullList)

    fullList - filteredDoubles

  }

  println(sumOfNumbers(List(1,1,2,2,3,3,4,5)))
}