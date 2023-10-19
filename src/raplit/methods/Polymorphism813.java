package raplit.methods;

public class Polymorphism813 {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Sheep a2 = new Sheep();
		BabyDog a3 = new BabyDog();
		
		a1.print();
		a2.print();
		a3.print();
		
	}

}
class Animal{
	public void print() {
		System.out.println("eating");
	}	
}

class Sheep extends Animal{
	public void print() {
		System.out.println("eating grass");
	}
}

class BabyDog extends Animal{
	public void print() {
		System.out.println("drinking milk");
	}
}