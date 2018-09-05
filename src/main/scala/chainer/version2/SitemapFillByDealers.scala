package chainer.version2

class StringFillByThirdThing extends StringFiller {

  def fill(stringBuilder: StringBuilder): Unit = {
    stringBuilder.append("ThirdThing")
  }

}