
object Absolute {

  def abs(num: Int): Int = {
    if (num < 0) -num
    else num
  }

  def formatAbs(num: Int): String = {
    val msg = "Absolute value of %d is: %d"
    msg.format(num, abs(num))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(readLine.toInt))
  }
}
