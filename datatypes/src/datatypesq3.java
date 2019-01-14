//3.  Write a Java program that reads in two floating-point numbers and tests   whether they are the same up to three decimal places. 

import java.util.*;  

class datatypesq3
{
  public static void main(String args[]) 
  {

    Scanner consoleInput = new Scanner(System.in);
    System.out.println("enter a number  " );
    double num1 = consoleInput.nextDouble();

     System.out.println("enter another number ");
     double num2 = consoleInput.nextDouble();
     num1 = Math.round(num1*1000);
     num2 = Math.round(num2*1000);


     if(num1==num2){
    System.out.println("both entered numbers are equal");
      }
      else{System.out.println("both entered numbers are not equal");}
    

    
  }
}