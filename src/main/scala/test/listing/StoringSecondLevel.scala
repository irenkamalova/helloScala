package test.listing
import scala.collection.mutable

class StoringSecondLevel(val markCode : String) extends Storing(markCode) {

  val mapOfModel : mutable.Map[String, StoringThirdLevel] = mutable.Map.empty

}