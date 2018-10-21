package calc

class Calc {

  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = {
    t match {
      case Sum(left, right) => eval(left, env) + eval(right, env)
      case Var(string) => env.apply(string)
      case Const(value) => value
    }
  }
}

abstract class Tree

case class Sum(left: Tree, right: Tree) extends Tree
case class Var(string: String) extends Tree
case class Const(value: Int) extends Tree

object TestCalc extends App {
  val calc = new Calc
  val tree0 = Sum(Var("y"), Const(3))
  val tree1 = Sum(Var("x"), Const(4))
  val env: String => Int = {case "x" => 5 case "y" => 7}
  // явное указание : String => Int позволяет скомпилировать пример
  println(calc.eval(tree0, env))
  println(calc.eval(tree1, env))
}
