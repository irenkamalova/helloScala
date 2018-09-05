package chainer.version3

class StringFillByThirdThing extends StringFiller {

  override def apply(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("ThirdThing")
  }

}