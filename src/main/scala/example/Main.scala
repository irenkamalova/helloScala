package example

object Main extends App {

  println(Session.sqrt(2.0))
  println(Session.sqrt(4.0))
  println(Session.sqrt(0.1e-20))
  println(Session.sqrt(1e-6))
  println(Session.sqrt(1.0e20))
  println(Session.sqrt(1.0e50))

  println(MoreCorrectSession.sqrt(2.0))
  println(MoreCorrectSession.sqrt(4.0))
  println(MoreCorrectSession.sqrt(0.1e-20))
  println(MoreCorrectSession.sqrt(1e-6))
  println(MoreCorrectSession.sqrt(1.0e20))
  println(MoreCorrectSession.sqrt(1.0e50))

}
