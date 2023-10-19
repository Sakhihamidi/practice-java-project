package inheritance;

public class Payroll_Child extends Parent{
	
		
	public Payroll_Child(String name, String lastName, String dateOfBirth, String email, double manSalary) {
		super(name, lastName, dateOfBirth, email);
		this.manSalary = manSalary;
	}
	
	

	private double manSalary;
	
	
	
	public double getManSalary() {
		return manSalary;
	}



	public void setManSalary(double manSalary) {
		this.manSalary = manSalary;
	}



	public void printSalary() {
		System.out.println(manSalary);
	}

}
