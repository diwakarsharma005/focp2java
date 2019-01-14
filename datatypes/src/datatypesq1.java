//Q-1.  Write a program that takes two integers (values to be given within the program) and displays the output of the following operators: addition, subtraction, multiplication, division and modulus. 

class datatypesq1
{
  public static void main(String args[]) 
  {
    float num1,num2,add,subtract,multiply,divide,modulus;
    num1 = 5; 
    num2 = 3; 
    System.out.println("num1 is " + num1);
     System.out.println("num2 is " + num2);
     add=num1 + num2;
    System.out.println(" num1 + num2 is " + add);
     subtract=num1 - num2;
    System.out.println(" num1 - num2 is " + subtract);
     multiply=num1 * num2;
    System.out.println(" num1 * num2 is " + multiply);
     divide=(num1/num2);
    System.out.println(" num1 / num2 is " + divide);
     modulus=num1%num2;
    System.out.println("  num1 % num2 is " + modulus);

    
  }
}