//for complex demp static

class complex{
	private int real;
	int imaginary;
	//non -parametrized constructor
	complex(){}
	//parametrised constructor
	complex(int real ,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
     
    /*  complex add(complex c){
     	complex cadd=new complex();
     	cadd.real=real + c.real;
     	cadd.imaginary=imaginary+ c.imaginary;
     	return cadd;
     }
     */
     int getreal(){
     	return real;
     }
     void setreal(int r){
     	real =r;
     }
}
class real2b{
	public static void main(String[] args) {
		complex c1 = new complex(1,2);
		complex c2 = new complex(5,6) ;
		complex c3 = new complex();
		c3=add(c1,c2);
		System.out.println("c1 = " +c1.getreal() +" " + c1.imaginary);
		System.out.println("c2 = " +c2.getreal() +" " + c2.imaginary);
		System.out.println("sum = " +c3.getreal() +" " + c3.imaginary);
	}
     public static complex add(complex c1,complex c2){
     	complex c3 = new complex();
     	int r=c1.getreal() + c2.getreal();
     	c3.setreal(r);
     	c3.imaginary=c1.imaginary+c2.imaginary;
     	return c3;
     }
}
