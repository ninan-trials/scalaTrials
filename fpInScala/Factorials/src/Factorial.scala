
class Factorial {

  def factorial(num: Int): Int = {
    def recursive(num: Int, accumulator: Int): Int = {
      if (num <= 0) {
        accumulator
      }
      else {
        recursive(num - 1, num * accumulator)
      }
    }

    recursive(5, 1)
  }

  def main(args: Array[String]): Unit = {
    println("Factorial is: %d ", factorial(readLine.toInt))
  }
}
