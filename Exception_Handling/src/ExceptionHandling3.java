/*3. Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument. Add a finally clause and print a message to prove you were there.*/

class ExceptionHandling3{
public static void main(String[] args) {
	
	try{
		throw new ArithmeticException("Exception throw using throw");

	}
	catch(ArithmeticException e){
		System.out.println(e.toString());
       
	}
	finally{
		System.out.println("finally");
	}
}
}