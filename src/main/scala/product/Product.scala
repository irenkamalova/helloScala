package product

object Product {

  def product(f: Int => Int) (a: Int, b: Int): Int = {
//    def prod(a: Int, b: Int): Int = {
//
//    }
    if (a > b) 1
    else f(a) * product(f) (a + 1, b)
  }

  def fact(n: Int) = product(x => x)(1, n)

  def general(f: Int => Int) (a: Int, b: Int) (g: (Int, Int) => Int): Int = {
    if (a > b) 1
    else g(f(a), general(f) (a + 1, b) (g))
  }

  def factFromGeneral(n: Int) = general(x => x) (1, n) (pr)

  def pr(x: Int, y: Int): Int = x * y

}
