package practiceabstract;

public class ClassAbstract {
	public static void main(String[] args) {
		Dog dogObject = new Dog();
		dogObject.makesound();
		
		Cat catObject = new Cat();
		catObject.makesound();
		
		Animal animalObj =new Animal();
		animalObj.makesound();
		// the problem is that we could make Animal Object that is not a good programming practice
	}
	
	

}


class Animal{// Parent clas
	public void makesound() {
		System.out.println("All Animal Make Sounds");
	}
}

class Dog extends Animal{//Child Calls

	@Override
	public void makesound() {
		System.out.println("Dog make Sounds Bark Bark");
	}
	
}

class Cat extends Animal{ // Child Class
	public void makesound() {
		System.out.println("Cat make Sounds Mew Mew");
	}
	
}