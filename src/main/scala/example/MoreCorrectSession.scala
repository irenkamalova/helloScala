package example

object MoreCorrectSession {

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double): Double =
      guess - ((guess - (x / guess)) / 2)

    def isGoodEnough(guess: Double): Boolean =
      (abs(guess * guess - x) / x) < 0.001

    def abs(d: Double): Double = if (d > 0) d else -d

    sqrtIter(1.0)
  }

}
