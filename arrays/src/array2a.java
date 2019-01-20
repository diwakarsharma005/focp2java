/*2.	Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
i)	its elements.
ii)	Sum of all the elements
iii)	Largest number in the array
iv)	Smallest number in the array
*/

import java.util.*;

class array2a
{
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int total=0;
		for(int counter = 0 ; counter<array.length ; counter++)
			total += array[counter];
		System.out.println(" sum of all array element is" + total);
       int max = Arrays.stream(array).max().getAsInt(); 
        System.out.println("Largest in given array is " +max);
           int min = Arrays.stream(array).min().getAsInt(); 
        System.out.println("smallest  in given array is " +min);
	}
}