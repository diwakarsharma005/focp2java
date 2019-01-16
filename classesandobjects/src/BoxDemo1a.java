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
Box(){
	
}
Box(double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
}
}
class BoxDemo1a{
	public static void main(String[] args){
	Box c = new Box();
	Box c1 = new Box(6,6,6);
	c.setDim();
	System.out.println("volume is"+c.volume());
	System.out.println("volume with Parameterized constructor is  "+c1.volume());
}
}

