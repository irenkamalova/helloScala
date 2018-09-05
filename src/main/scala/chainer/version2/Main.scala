package chainer.version2

object Main extends App {

  execute()

  def execute(): Unit = {
    val stringBuilder = new StringBuilder

    val sitemapFiller = new StringFillByFirstThing

    sitemapFiller.fillBy(new StringFillByFirstThing, stringBuilder)
      .fillBy(new StringFillBySecondThing, stringBuilder)
      .fillBy(new StringFillByThirdThing, stringBuilder)

    println(stringBuilder)
  }

}
