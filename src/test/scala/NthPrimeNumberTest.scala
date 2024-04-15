import org.scalatest.funsuite.AnyFunSuite

class NthPrimeNumberTest extends AnyFunSuite {

  test("findNthPrimeNumber returns correct prime number for valid inputs") {
    assert(NthPrimeNumber.findNthPrimeNumber(1) == 2)
    assert(NthPrimeNumber.findNthPrimeNumber(2) == 3)
    assert(NthPrimeNumber.findNthPrimeNumber(3) == 5)
    assert(NthPrimeNumber.findNthPrimeNumber(4) == 7)
  }

  test("findNthPrimeNumber returns -1 for invalid inputs") {
    assert(NthPrimeNumber.findNthPrimeNumber(0) == -1)
    assert(NthPrimeNumber.findNthPrimeNumber(-1) == -1)
  }
}
