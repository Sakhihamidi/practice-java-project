package practicewithelaha;

public class WorkingwithStringBuufStringBuil {
	public static void main(String[] args) {

		// String buffer and String Builder is Mutable
		// it will delete all strings from Heap Memory

		StringBuffer name = new StringBuffer("Elaha");
		System.out.println(name);
		System.out.println(name.hashCode());

		System.out.println(name.append(" Sharif"));
		
		System.out.println(name.hashCode());
		
		// it will remove first String from memory and replace 2nd one // Mutable
		
		name.reverse();
		name.reverse();

		name.delete(0, 3);

		
		name.insert(2, "Car");
	}
}
