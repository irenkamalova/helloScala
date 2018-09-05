package chainer.version3

class StringFillBySecondThing extends StringFiller {

  override def apply(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("SecondThing")
  }
}