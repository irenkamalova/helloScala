package chainer.version1

object Main extends App {

  def execute(): Unit = {
    var stringBuilder = new StringBuilder
    StringFillByFirstThing.fillbyFirstThing(stringBuilder)
    StringFillBySecondThing.fillBySecondThing(stringBuilder)
    StringFillByThirdThing.fillByThirdThing(stringBuilder)
    println(stringBuilder)
  }

  execute()

}
