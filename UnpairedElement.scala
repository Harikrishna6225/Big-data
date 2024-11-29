object UnpairedElement {
  def findUnpairedElement(A: Array[Int]): Int = {
    var result = 0

    // XOR all elements in the array
    for (num <- A) {
      result ^= num
    }

    // The result will be the unpaired element
    result
  }

  def main(args: Array[String]): Unit = {
    val A = Array(4, 5, 4, 6, 6)
    val unpaired = findUnpairedElement(A)

    println(s"The unpaired element is: $unpaired")  // Output: 5
  }
}
