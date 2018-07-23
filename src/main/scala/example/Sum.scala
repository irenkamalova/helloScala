package example

object Sum {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def sumTailRec(f: Int => Int, a: Int, b: Int): Int = {
    def loop(result: Int, a: Int, b: Int): Int = {
      if (a > b) result
      else loop(f(a) + result, a + 1, b)
    }
    loop(0, a, b)
  }


  def sumTailRec2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(result: Int, a: Int): Int = {
      if (a > b) result
      else loop(f(a) + result, a + 1)
    }
    loop(0, a)
  }

  sumTailRec(x => x * x, 3, 5)

  def sumTailRec3(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      def loop(result: Int, a: Int): Int = {
        if (a > b) result
        else loop(f(a) + result, a + 1)
      }

      loop(0, a)
    }
    sumF
  }
  // for now, sumTailRec3 return another func

  sumTailRec3(x => x * x)(3, 5)

  //!!!
  def sumCube = sumTailRec3(x => x * x * x)
  sumCube(3, 5)
  // - sugar!!! ^^
  sumCube(1, 2) + sumCube(2, 3)
}
