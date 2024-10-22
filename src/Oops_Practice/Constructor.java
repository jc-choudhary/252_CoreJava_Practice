package Oops_Practice;

	// Default Constructor : When we dont create any constructor that time default constructor is created automatically....

	// Non-parameterized Constructor

//public class Constructor {
//Constructor(){
//	System.out.println("I am a Constructor");
//}
//void m1() {
//	System.out.println(222);
//}
//public static void main(String args[]) {
//	Constructor obj = new Constructor();
//	obj.m1();
//}
//}

	// Parameterized Constructor 

public class Constructor{
	
	int a;
	String b;
	
	Constructor(int p,String q){
		a=p;  // initializing variables through constructor
		b=q;
		
	}

	void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String args[]) {
		Constructor obj = new Constructor(4,"Vijay");
		obj.m1();
		obj.a=10;
		obj.m1();
	}
}











