package practice.wekk_7.overriding;

public class OverLoadingExample {
	// OVERRIDING MEANS DIFFRENT IMPLEMNTATION OF PARENT METHOD
	//OVERLOADING MEANS DIFFRENT PARAMETER OF ONE METHOD WITH THE SAME NAME

	static public int add(int a, int b) {
		return a + b;
	}
	
	static public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static public double add(double a, double b, double c) {
		return a+b+c;
		
	}
	static public double add(double a, double b, double c, double d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1.2, 2.3,3,7.5));

		
	}
	
	

	//------Method Overloading +++++++++++++++++++++++++++++++++++++++++++ Method Overriding	
//		ocures in one class						                          occures in two classes 
	// Name of Method is same with diffrent number of parameter		name and parameter are samae
	// 
		
	//1)Method overloading is used to increase the readability of the program.	
	//Method overriding is used to provide the specific implementation of the method 
	//that is already provided by its super class.
		
	//2)Method overloading is performed within class.	
	//Method overriding occurs in two classes that have (inheritance) relationship.
		
	//3)In case of method overloading, parameter must be different.	
	//In case of method overriding, parameter must be same.
		
	//4)Method overloading is the example of compile time polymorphism.	
	//Method overriding is the example of run time polymorphism.
		
	//5)In java, method overloading can't be performed by changing return type of the method only. 
	//Return type can be same or different in method overloading. But you must have to change the parameter.	
	//Return type must be same or covariant in method overriding.



	
}
