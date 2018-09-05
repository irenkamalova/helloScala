package test.listing
import scala.collection.mutable

class StoringThirdLevel(model : String) extends Storing(model) {
  val mapOfModel : mutable.Map[String, StoringSecondLevel] = mutable.Map.empty
}
