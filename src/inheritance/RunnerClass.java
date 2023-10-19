package inheritance;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		
		Payroll_Child payObj = new Payroll_Child("Ahmad", "Ahmadoi", "1986","Ahmad@gmail.com", 10000);
		
		payObj.print();
		payObj.printSalary();
	}

}
