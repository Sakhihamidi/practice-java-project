package javaproject;

public class AcademicHierarchy {
	public static void main(String[] args) {
		GraduateStudent graObj = new GraduateStudent();
		graObj.age = 25;
		graObj.name = "Ahmad";
		graObj.studentId = 123;
		graObj.researchTopic = "Testing job Market";
		graObj.conductResearch();
		graObj.study();
	}
}

class Person {
	String name;
	int age;

}

class Student extends Person {

	int studentId;

	public void study() {
		System.out.println("Stduent " + studentId + " is studying");
	}
}

class GraduateStudent extends Student {
	String researchTopic;

	public void conductResearch() {
		System.out.println("Graduate student is researching on: " + researchTopic);
	}
}
