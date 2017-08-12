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
  	
  	fib(6);                                   //> res0: Int = 8
		
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
		
		 val y = 0;
		 if(x==0){
		  y
		 }else{
			 	if(x == 1){
			 		x
			 	}else{
				 	x * (x-1)
				 	print(x + " ");
					factorial(x-1);
			 	}
		 }
  }                                               //> factorial: (x: Int)Int
  
	factorial(6);                             //> 6 5 4 3 2 res1: Int = 1
  
  /**
  4.)
  **/
  
  def sum(x:Int):Int ={
  	
  	if(x == 0){
  		0;
  	}else{
  		sum((x/10)%10) + sum((x/100)%10);
  	}
  }                                               //> sum: (x: Int)Int
  
  sum(123)                                        //> res2: Int = 0
}