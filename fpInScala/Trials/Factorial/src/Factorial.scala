
object Factorial {

  def factorial(num: Int): Int = {
    def recursive(num: Int, accumulator: Int): Int = {
      if (num <= 0) {
        accumulator
      }
      else {
        recursive(num - 1, num * accumulator)
      }
    }

    recursive(num, 1)
  }

  def main(args: Array[String]): Unit = {
    println("Factorial is: " + factorial(readLine.toInt))
  }
}
