package inderitance.super_;

public class Student extends Person{
	private String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	public String getDetails() {
		return super.getDetails() + " \t 학번: " + studentId;
	}
}
