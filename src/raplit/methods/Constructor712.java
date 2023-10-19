package raplit.methods;

public class Constructor712 {

	public static void main(String[] args) {
		Cosntructor consObj = new Cosntructor();
		consObj.printInfo();
		
}
	}
	
	class Cosntructor{
		private String name;
		private int age;
		private String address;

		public Cosntructor() {
			name = "Heidi";
			age = 25;
			address = "Virginia";

		}

		public void printInfo() {
			System.out.println(name + " " + age + " " + address);
		}
	}
