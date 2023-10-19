package practiceabstract;

public class ClassAbstract1 {

		public static void main(String[] args) {
			Dog11 dogObject = new Dog11();
			dogObject.makesound();
			
			Cat11 catObject = new Cat11();
			catObject.makesound();
			
			}
	

	}


abstract class Animal1{// Parent clas
		public void makesound() {
			System.out.println("All Animal Make Sounds");
		}
	}

	class Dog11 extends Animal1{//Child Calls

		@Override
		public void makesound() {
			System.out.println("Dog make Sounds Bark Bark");
		}
		
	}

	class Cat11 extends Animal1{ // Child Class
		public void makesound() {
			System.out.println("Cat make Sounds Mew Mew");
		}
		
	}
