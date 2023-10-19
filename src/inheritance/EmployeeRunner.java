package inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		/*Employee emObj = new Employee();
		emObj.setName("Negar");
		emObj.setLastName("Any Last Name");
		emObj.setEmail("NegraGtekSchool.us");
		emObj.setSalary(12000);*/

		
		//emObj.show();
		
		//System.out.println(emObj.getName());
		
		
		Employee emObj = new Employee("Farzana", "AsgharZada", 12000, "farzana@tekScholl.us");
		emObj.show();
		System.out.println("++++++++++++++++++++++++++++++++++");
			
		Employee emObj1 = new Employee("Elaha", "Sharif", 1100, "Elaha@tekScholl.us");
		emObj1.show();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Employee emObj2 = new Employee("Sakhi", "Hamidi", 10000, "sakhi@tekScholl.us");
		emObj2.show();

		
		

		//public Employee("Farzana", String lastName, double salary, String email) {

		
		
			
		
		
	}

}
