package chainer.version3


object Main extends App {

  val fillersList = List(
    new StringFillByFirstThing(),
    new StringFillBySecondThing(),
    new StringFillByThirdThing())

  execute()

  def execute(): Unit = {
    val stringBuilder = new StringBuilder
    fillersList.foreach(f => f.apply(stringBuilder))
    println(stringBuilder)
  }

}
