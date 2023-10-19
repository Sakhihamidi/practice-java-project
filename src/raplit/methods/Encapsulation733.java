package raplit.methods;

public class Encapsulation733 {
	public static void main(String[] args) {
		
		Student1 stuObj = new Student1();
		stuObj.setStudentName("James");
		stuObj.setStudentRollNo(4);
		stuObj.setStudentID(12345);
		
		System.out.println("Student's Name: " + stuObj.getStudentName());
		System.out.println("Student's Roll no: " + stuObj.getStudentRollNo());
		System.out.println("Student's ID: " +stuObj.getStudentID());
		
	}

}

class Student1{
	private String studentName;
	private int studentRollNo;
	private int studentID;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentRollNo() {
		return studentRollNo;
	}
	
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
		
}