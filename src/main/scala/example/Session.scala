package example

object Session {

  def sqrt(x: Double): Double = sqrtIter(1.0, x)

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double): Double =
     guess - ((guess - (x / guess)) / 2)

  def isGoodEnough(guess: Double, x: Double): Boolean =
    (abs(guess * guess - x) / x) < 0.001

  def abs(d: Double): Double = if (d > 0) d else -d

}
