object rationals {
  println("Rationals worksheet")
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator has to be nonzero")

  // second constructor:
  def this(x: Int) = this(x, 1)

  def numer = x
  def denom = y

  def +(that: Rational) = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def neg = new Rational(-numer, denom)

  def -(that: Rational) = Rational.this + that.neg

  override def toString = {
    numer.toString + "/" + denom.toString
  }
}


val x = new Rational(1, 2)
x.numer
x.denom

val y = new Rational(2, 3)

(x + y).toString