/**
  * Created by ninanjohn on 03/05/17.
  */
object Fibonacci {

  def fibonacci(num: Int): Int = {
    val firstNumber = 0
    val secondNumber = 1
    print(firstNumber + "\t" + secondNumber)
    def recursive(prevValue: Int, accumulator: Int, limit: Int): Int = {
      if (limit - 2 <= 0)
        accumulator
      else {
        print("\t")
        print(accumulator + prevValue)
        recursive(accumulator, accumulator + prevValue, limit - 1)
      }
    }

    recursive(firstNumber, secondNumber, num)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val num = readLine.toInt
    println("\n Fibonacci Series uptill " + num + " is : " + fibonacci(num))
  }
}
