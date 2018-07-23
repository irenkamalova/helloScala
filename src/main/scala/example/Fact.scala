package example

object Fact {

  def factorial(n: Int): Int = {
    fact(1, n)
  }

  def fact(result: Int, n: Int): Int = {
    if (n == 0) result
    else fact(result * n, n - 1)
  }

  def otherViewFact(n: Int): Int = {
    def fact(result: Int, n: Int): Int =
      if (n == 0) result
      else fact(result * n, n - 1)
    fact(1, n)
  }

}

