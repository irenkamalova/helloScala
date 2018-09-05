package test.listing

import scala.collection.mutable

object Main extends App {


  def getNextListing[T <: Storing](element: String,
                                   map: mutable.Map[String, T],
                                   create: String => T) : T = {
    val listingOptional = map.get(element)
    if (listingOptional.isEmpty) {
      val listing = create(element)
      map += (element -> listing)
      listing
    } else {
      listingOptional.get
    }
  }

  appendCarListing()

  def appendCarListing(): Unit = {
    val start = System.currentTimeMillis
    val mapOfRegions: mutable.Map[String, StoringFirstLevel] = mutable.Map.empty

    val listMsg = List( Message("1", "m0", "3", "2013"),
      Message("1", "m1", "3", "2014"),
      Message("1", "m1", "3", "2015"),
      Message("1", "m1", "3", "2016"),
      Message("1", "m1", "3", "2017"),
      Message("1", "m2", "3", "2011"),
      Message("2", "m0", "3", "2010"),
      Message("2", "m1", "3", "2014"),
      Message("2", "m2", "3", "2015"),
      Message("2", "m2", "4", "2016"),
      Message("3", "2", "3", "2017"),
      Message("3", "2", "3", "2011"),
      Message("3", "2", "3", "2012"),
      Message("3", "2", "3", "2013"),
      Message("3", "2", "3", "2010"))

      listMsg.foreach(msg => {
          val region = msg.regionCode
          val carListingRegion = getNextListing(region, mapOfRegions,
            createCarListingRegion)

          val markCode = msg.mark
          val carListingMark = getNextListing(markCode,
            carListingRegion.mapOfSecondLevel, createCarListingMark)

          val modelCode = msg.model
          getNextListing(modelCode, carListingMark.mapOfModel, createCarListingModel)
      })

    mapOfRegions.foreach( reg => {
      val regionName = reg._1
      reg._2.mapOfSecondLevel.foreach(mark => {
        val markCode = mark._1
        mark._2.mapOfModel.foreach( model => {
          val modelCode = model._1
          println(s"/$regionName/$markCode/$modelCode/all/")
        })
      })
    })
    val end = System.currentTimeMillis
    println(s"TIME ESTIMATION ${end - start}")
  }


  def createCarListingRegion(region: String): StoringFirstLevel = {
    new StoringFirstLevel(region)
  }

  def createCarListingMark(mark: String): StoringSecondLevel = {
    new StoringSecondLevel(mark)
  }

  def createCarListingModel(model: String): StoringThirdLevel = {
    new StoringThirdLevel(model)
  }


}
