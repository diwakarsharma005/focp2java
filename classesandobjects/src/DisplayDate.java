import java.util.*; 
class Date{
	int year ;
	int month;
	int day ;
 Date(){
	day=1;
	month=1;
	year=2000;

	System.out.println("Non-parameterized date is  "  + day + " / "+ month + " / " + year );
}
 Date(int d, int m, int y){
	day=d;
	month=m;
	year=y;
	System.out.println("parameterized date is " + day + " / "+ month + " / " + year );
}
}

	
	


class DisplayDate{
	public static void main(String[] args){
	Date c = new Date();
	
	
	Date c1= new Date(2,2,1900);
}
}

