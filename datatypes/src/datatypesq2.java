//2.    Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program. 

import java.util.*; 

class datatypesq2
{
  public static void main(String args[]) 
  {
    
     Scanner consoleInput = new Scanner(System.in);
     System.out.println("number for corresponding month is  " );
    int day= consoleInput.nextInt();
    switch(day){
        case 1:
        System.out.println("JANUARY");
        break;
        case 2:
        System.out.println("FEBRUARY");
        break;
        case 3:
        System.out.println("MARCH");
        break;
        case 4:
        System.out.println("APRIL");
        break;
        case 5:
        System.out.println("MAY");
        break;
        case 6:
        System.out.println("JUNE");
        break;
        case 7:
        System.out.println("JULY");
        break;
        case 8:
        System.out.println("AUGUST");
        break;
        case 9:
        System.out.println("SEPTEMBER");
        break;
        case 10:
        System.out.println("OCTOBER");
        break;
        case 11:
        System.out.println("NOVEMBER");
        break;
        case 12:
        System.out.println("DECEMBER");
        break;
        default:
        System.out.println("wrong number entered.PLEASE enter number between 1 and 12");

    }


    
  }
}