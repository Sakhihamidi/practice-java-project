package javaproject;

public class AnimalKingdom {
	public static void main(String[] args) {
		Bird birdObj = new Bird();
		birdObj.age = 1;
		birdObj.name= "Sara";
		birdObj.eat();
		birdObj.fly();
		birdObj.Sleep();
	}

}

class Animal{
	String name;
	int age;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void Sleep() {
		System.out.println("Animal is slepping");
	}
	
}

class Bird extends Animal{
	public void fly(){
		System.out.println("Bird is flying");
	}
}