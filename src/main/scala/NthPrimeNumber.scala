import scala.annotation.tailrec

object NthPrimeNumber extends App {

  // Main method to find the nth prime number
  def findNthPrimeNumber(n: Int): Int = {
    if (n <= 0) -1

    n match {
      case 1 => 2
      case 2 => 3
      case 3 => 5
      case _ => findNthPrimeNumberRec(n, 3, 5)
    }
  }

  @tailrec
  def findNthPrimeNumberRec(n: Int, count: Int, nxtNum: Int): Int = {
    if (count == n) nxtNum
    else {
      val nextCandidate = findNextPrime(nxtNum + 2)
      findNthPrimeNumberRec(n, count + 1, nextCandidate)
    }
  }

  @tailrec
  def findNextPrime(num: Int): Int = {
    if (isPrime(num)) num
    else findNextPrime(num + 2)
  }

  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2 || num == 3) true
    else {
      val limit = Math.sqrt(num).toInt
      !(2 to limit).exists(x => num % x == 0)
    }
  }

 println(findNthPrimeNumber(6))
}
