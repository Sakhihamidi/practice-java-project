package raplit.methods;

public class inheritance715 {
	
	/* 
	 * Go to Main class write main method. create an object of class Child1. create an object of class Child2
	 * call instance variable using Child2 object call method in Child1 class by using Child1 object
	 */
	
	
	public static void main(String[] args) {
		
		Child1 ChiObj = new Child1();
		Child2 ChiObj2 = new Child2();
		
		
		System.out.println(ChiObj2.number);
		System.out.println(ChiObj.method(2));

		
	}

}
/*
 * in Child2 class declare an instance variable (int number=1;) create
 * parametrized void method with one int variable inside the method instance
 * variable equal to method int variable
 */

class Child2 {
	int number = 1;

	public void print(int a) {
		number = a;
	}
}

/*
 * Go to child1 class extend this class to child2 class create an int method
 * call the parameterized method from Child2 class and pass 2 for the method
 * variable return number
 */
class Child1 extends Child2 {
	
	public int method(int b) {
		Child2 child2Obj = new Child2();
		child2Obj.print(2);
		return b;
	}

}