//1.    Write a Java program to solve quadratic equations 

import java.util.*;   

class QuadEq
{
	public static void main (String args[])

	{
	   Scanner consoleInput = new Scanner(System.in);
       System.out.println("enter coeficient of x^2: ");
        double a = consoleInput.nextInt();
        System.out.println("enter coeficient of x: ");
        double b = consoleInput.nextInt();
        System.out.println("enter constant: ");
        double c = consoleInput.nextInt();
        double d=(b*b)-4*a*c;
        if (d>0)
        {

        	double r1=((-b)+Math.sqrt(d)) /(2*a);
        	double r2=((-b)-Math.sqrt(d)) /(2*a) ;
        	System.out.println("first root="+ r1);
        	System.out.println("second root="+ r2);

        }
        
        else if (d==0)
        {
        	double r3=(-b) /(2*a);
        	System.out.println("both the roots are same and are equal to:"+r3);
        }

        else
        System.out.println("enter valid values"); 	
        


	
        }
}