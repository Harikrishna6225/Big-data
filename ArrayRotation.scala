object ArrayRotation {
  def rotateArray(A: Array[Int], K: Int): Array[Int] = {
    val N = A.length

    // If the array is empty or the number of rotations is zero, return the original array
    if (N == 0 || K == 0) return A

    // Normalize K to avoid unnecessary full rotations (e.g., rotating an array of size N by N or more times is redundant)
    val rotations = K % N

    // Rotate the array
    val rotatedArray = A.takeRight(rotations) ++ A.dropRight(rotations)
    
    rotatedArray
  }

  def main(args: Array[String]): Unit = {
    val A = Array(1, 2, 3, 4, 5)
    val K = 2
    val rotated = rotateArray(A, K)

    // Print the result after rotation
    println(rotated.mkString(", "))  // Output: 4, 5, 1, 2, 3
  }
}
