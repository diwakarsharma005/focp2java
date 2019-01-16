import java.util.*; 
class Box{
	double width;
	double height;
	double depth;
	
	double volume(){
	return  width * height * depth;
}
void setDim(){
	Scanner consoleInput = new Scanner(System.in);
	 System.out.println("enter height" );
    height = consoleInput.nextInt();
    System.out.println("enter width" );
    width = consoleInput.nextInt();
    System.out.println("enter depth" );
    depth = consoleInput.nextInt();
}
}
class BoxDemo{
	public static void main(String[] args){
	Box c = new Box();
	c.setDim();
	System.out.println("volume is"+c.volume());
}
}

