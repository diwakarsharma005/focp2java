import java.util.*; 
class Date1cc{
	int year ;
	int month;
	int day ;
 Date1cc(){
	day=1;
	month=1;
	year=2000;

	System.out.print("date is " + year +" / " + month + " / "+ day);
}
 Date1cc(int d, int m, int y){
	day=d;
	month=m;
	year=y;
	System.out.print("date is " + year + " / " + month + " / "+ day);
}
}

	
	


class Date1c{
	public static void main(String[] args){
	Date1cc c = new Date1cc();
	
	
	Date1cc c1= new Date1cc(2,2,1900);
}
}

