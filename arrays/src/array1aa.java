//1.    Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions. 

import java.util.*; 

class array1aa
{
  public static void main(String args[]) 
  {
    
    
     Scanner consoleInput = new Scanner(System.in);
     int a[] = new int[10];
     boolean flag=false;
     int i , item=0;
     for(i=0;i<10;i++)
     	a[i] = consoleInput.nextInt();

     System.out.println("enter no " );
      item = consoleInput.nextInt();
     for(i=0;i<10;i++)
     	{if(item==a[i])
     		{System.out.println("item at location " + i );
     		flag=true;
     		break;
            }

     	}
     	if(flag==false)
     		{System.out.println("item of index ");}

     }
 }