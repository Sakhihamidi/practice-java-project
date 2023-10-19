package finalandstatic;

public class WorkingWithAbstract {
	public static void main(String[] args) {
		
		Dog dogObj = new Dog();
		dogObj.makeSound();
		
		Cat catObj = new Cat();
		catObj.makeSound();
		
	}
	
	
	

}


abstract class Animal{
	abstract public void makeSound();
	
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog Make Sound");
	}
	
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat Make Sound");
	}
	
}