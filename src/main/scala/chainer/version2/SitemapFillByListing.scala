package chainer.version2

class StringFillBySecondThing extends StringFiller {

  def fill(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("SecondThing")
  }
}