package practice.wekk_7.overriding;

public class MethodOverriding2 {
	public static void main(String[] args) {
		
		Child1 Child1Obj = new Child1();
			System.out.println(	Child1Obj.add(1, 2));		
	}

}


class Parent1{
	public int add(int a, int b) {
		return a + b; //3
		
	}
	
}

class Child1 extends Parent1{

	public int add(int a, int b) {
		return a + b +1;//4
	}


	
	
}