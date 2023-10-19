package raplit.methods;

public class Encapsulation735 {
	public static void main(String[] args) {
		Strudent studObj = new Strudent();
		studObj.setStudentName("John");
		studObj.setPhysicsMark(85);
		studObj.setChemistryMark(75);
		studObj.setBiologyMark(90);
		
		studObj.readmarks();
		
	}
}

class Strudent{
	private String studentName;
	private int physicsMark;
	private int chemistryMark;
	private int biologyMark;
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getPhysicsMark() {
		return physicsMark;
	}
	
	public void setPhysicsMark(int physicsMark) {
		this.physicsMark = physicsMark;
	}
	 int getChemistryMark() {
		return chemistryMark;
	}
	
	public void setChemistryMark(int chemistryMark) {
		this.chemistryMark = chemistryMark;
	}
	
	public int getBiologyMark() {
		return biologyMark;
	}
	
	public void setBiologyMark(int biologyMark) {
		this.biologyMark = biologyMark;
	}
	
	public void readmarks() {
		System.out.println("Student's Name: " + studentName);
		System.out.println("Marks in Physics: " + physicsMark);
		System.out.println("Marks in Chemistry: " + chemistryMark);
		System.out.println("Marks in Biology: " + biologyMark);

		System.out.println("Percentage of PCB: " + (physicsMark + chemistryMark + biologyMark)/3);
		
	}
	
	
}