import java.util.*;

class Base { 
static void Base() throws ArithmeticException { 
	System.out.println("Base-Class Constructor Called "); 
	
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		System.out.println("enter the value of b");
		b = sc.nextInt();
		c=a/b;
		System.out.println("a=" +a +"b ="+b+"a/b="+c);
	
	/*catch(ArithmeticException e){
		System.out.println("value enter is 0"+e);}*/
} 
} 

class Derived extends Base { 
Derived() { 
	System.out.println("Derived-Class Constructor Called "); 
   try{
   	Base();
   }

   	catch(ArithmeticException e){
		System.out.println("value enter is 0"+e);}
} 
} 

public class ExceptionHandling7 { 
public static void main(String[] args) { 
	Derived d = new Derived(); 
} 
} 
