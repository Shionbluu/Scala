package oneThis

object Major1Worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 1 + 2;                                  //> x  : Int = 3
  def square(x:Int) = x * x;                      //> square: (x: Int)Int
  
  println(square(x));                             //> 9
}