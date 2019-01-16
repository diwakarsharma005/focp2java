
class Employee{
	String first ;
	String last;
	double salary ;
 Employee(){
	first="Elon";
	last="musk";
	salary = 8888;

	System.out.println(" first name is " + first + " last name is "+ last + " salary is " + salary + " new salary after 10% raise " + RaiseSalary());
}
 Employee(String f ,String l, double s){
	first=f;
	last=l;
	salary=s;
		System.out.println(" first name is " + first + " last name is "+ last + " salary is " + salary + " new salary after 10% raise " + RaiseSalary());


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

	
	


class EmployeeTest{
	public static void main(String[] args){
	Employee c1 = new Employee();
	
	Employee c2= new Employee("bill","gates",100000);
	c1.YearlySalary();
	c1.RaiseSalary();
	c2.YearlySalary();
	c2.RaiseSalary();



}
}

