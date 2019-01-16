
import java.util.*;
class Employee2a{
	String first ;
	String last;
	double salary ;
	int year ;
	String address;
 Employee2a(){
	first="Elon";
	last="musk";
	salary = 8888;
	year=1994;
	address="64C Vasant Kunj 110070";

	System.out.printf("%10s %20s %30s" + " first name is " + first + " last name is "+ last + " salary is " + salary + "year of joining is " + year + " address is " + address);
	System.out.println();
}
 Employee2a(String f ,String l, double s){
	first=f;
	last=l;
	salary=s;
		System.out.printf( "10s %20s %30s" +"  first name is " + first + " last name is "+ last + " salary is " + salary + "year of joining is " + year + " address is " + address );
         System.out.println();
     
}


}

	
	


class EmployeeTest2a{
	public static void main(String[] args){
	Employee2a c1 = new Employee2a();
	
	Employee2a c2= new Employee2a("bill","gates",100000,99988,2005,"house no. 111,sector 22,122001");
	



}
}

