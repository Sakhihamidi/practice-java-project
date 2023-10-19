package raplit.methods;

public class inheritance716 {
	public static void main(String[] args) {
		Child22 Child22Obj = new Child22();
		System.out.println("Value of number in child2 is: "+Child22Obj.number);
		
		Child11 Child11Obj = new Child22();
		System.out.println("Value of number in child1 is: " +Child11Obj.number);

	}
}

class Child11{
	
	int number = 30;
}
class Child22 extends Child11{

	int number = 50;
}