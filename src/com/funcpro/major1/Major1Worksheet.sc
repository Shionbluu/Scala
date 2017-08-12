package oneThis

object Major1Worksheet {
  println("Welcome to the Scala worksheet");      //> Welcome to the Scala worksheet

  /**
  1.)
  **/
  
  	def fib(x:Int):Int ={
  		
	  	if(x == 0){
	  		0
	  	}else if(x == 1){
	  		1
	  	}else{
	  		fib(x-1) + fib(x-2);
	  	}
  	}                                         //> fib: (x: Int)Int
  	
  	
  	println(fib(1));                          //> 1
  	println(fib(2));                          //> 1
		println(fib(3));                  //> 2
  	println(fib(4));                          //> 3
  	println(fib(5));                          //> 5
		println(fib(6));                  //> 8
		
   /**
  2.)
  **/
  def fizzString(fizz:String):Unit ={
  	if(fizz.startsWith("f") == true && fizz.endsWith("b") == true){
  		 println("FizzBuzz");
  	}else if(fizz.startsWith("f") == true){
  		println("Fuzz");
  	}else if(fizz.endsWith("b") == true){
  		println("Buzz");
  	}
  }                                               //> fizzString: (fizz: String)Unit
  
	fizzString("fig");                        //> Fuzz
	fizzString("fib");                        //> FizzBuzz
	fizzString("bib");                        //> Buzz
  
   /**
  3.)
  **/
  
  def factorial(x:Int):Int ={
		  
		  if(x>=1){
		  	factorial(x) * factorial(x-1);
		  	
		  }else{
		  	0
			}
  	
  }                                               //> factorial: (x: Int)Int
  
  factorial(3);                                   //> java.lang.StackOverflowError
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet$.factorial$1(oneThis.Major1Worksheet.scala:53
                                                  //| )
                                                  //| 	at oneThis.Major1Worksheet
                                                  //| Output exceeds cutoff limit.
  
  
}