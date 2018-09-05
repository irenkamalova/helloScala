package chainer.version2

class StringFillByFirstThing extends StringFiller {

  def fill(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("FirstThing")
  }
}