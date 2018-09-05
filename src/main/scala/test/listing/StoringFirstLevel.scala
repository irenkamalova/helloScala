package test.listing
import scala.collection.mutable

class StoringFirstLevel(val region: String) extends Storing(region) {
  val mapOfSecondLevel : mutable.Map[String, StoringSecondLevel] = mutable.Map.empty
}
