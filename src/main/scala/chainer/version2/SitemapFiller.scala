package chainer.version2

abstract class StringFiller {

  def fill(stringBuilder: StringBuilder)

  def fillBy(sitemapFiller: StringFiller, stringBuilder: StringBuilder): StringFiller = {
    sitemapFiller.fill(stringBuilder)
    sitemapFiller
  }


}
