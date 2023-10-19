package inheritance;

public class Parent {
	// now we want to lock variables and use getter/setter and constructor
	//1- make all variables in child and parret to private
	//2- make constructor for all feilds using generate
	//3 remove super from parent class
	//4- make getter and setter for all fields 
	
	private String name;
	private String lastName;
	private String dateOfBirth;
	private String email;
	
	
	
	public Parent(String name, String lastName, String dateOfBirth, String email) {
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	
	


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getDateOfBirth() {
		return dateOfBirth;
	}





	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public void print() {
		System.out.println(name + lastName + dateOfBirth + email);
	}

}
