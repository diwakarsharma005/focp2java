/*1.	Write a program in java that illustrates the following exceptions:
a)    ArithmeticException
b)   ArrayIndexOutOfBoundsException
*/

import java.util.*;
class ExceptionHandling1{
	public static void main(String[] args) {
	try{
		int a;
		int b;
		int c;
		int[] d={2};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		System.out.println("a= " + a);
		
		System.out.println("enter the value of b");
		b = sc.nextInt();
		System.out.println("b= " + b);
		c=a/b;
		d[2]=99;
	}
	
	catch(ArithmeticException e){
		System.out.println("divide by 0"+e);
		
		}       								
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("array index oob"+e);
		}
	
		System.out.println("after try/catch blocks");
	

	}
}