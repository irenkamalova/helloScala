package chainer.version3

class StringFillByFirstThing extends StringFiller {

  def apply(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("FirstThing")
  }
}