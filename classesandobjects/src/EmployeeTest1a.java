/*2.	Repeat question 3 of in-class practice questions with Address defined as a 
separate class and used in Employee. Address class should include the following instance
 variables: First Line and Second Line and Pin code. Constructor and other member function 
 definitions of class Employee should be modified accordingly*/
class Employee{
	String first ;
	String last;
	double salary ;
 Employee(){
	first="Elon";
	last="musk";
	salary = 8888;

	System.out.println(" first name is " + first + " last name is "+ last + " salary is " + salary + " new salary after 10% raise " + RaiseSalary() );
}
 Employee(String f ,String l, double s){
	first=f;
	last=l;
	salary=s;
		System.out.println(" first name is " + first + " last name is "+ last + " salary is " + salary + " new salary after 10% raise " + RaiseSalary() );


}
void YearlySalary()
{
	double YearlySalary=(salary*12);
}
double RaiseSalary(){
	double RaiseSalary;
      RaiseSalary=(salary + (salary/10));
      return RaiseSalary;
}
}
class Address
{
	String fline;
	String sline;
	int pincode;
	  Address()
	{
		fline="house no.111,sector 14";
		sline="gurugram,India";
		pincode=122001;

		System.out.println("first line is " + fline + " second line is " + sline + " pincode is " + pincode);


	}
	Address(String fl, String sl , int pi){
		fline=fl;
		sline=sl;
		pincode=pi;
		System.out.println("first line is " + fline + " second line is " + sline + " pincode is " + pincode);

	}
}

	
	


class EmployeeTest1a{
	public static void main(String[] args){
	Employee c1 = new Employee();
	
	Employee c2= new Employee("bill","gates",100000);

	Address c1a = new Address();
	Address  c2a = new Address("house no 222,sector 24","delhi,India",111001);
	c1.YearlySalary();
	c1.RaiseSalary();
	c2.YearlySalary();
	c2.RaiseSalary();



}
}

