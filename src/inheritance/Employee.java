package inheritance;

public class Employee {
	
	private String name;
	private String lastName;
	private double salary;
	private String email;
		
	
	
	public Employee(String name, String lastName, double salary, String email) {
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	  public void show() { 
		  System.out.println(name); 
		  System.out.println(lastName);
		  System.out.println(salary); 
		  System.out.println(email);
	 

}
}
