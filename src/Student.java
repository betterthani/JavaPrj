
public class Student {
	private String name;
	private int age;
	private String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public void displayStudentInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 전공: " + this.major);
	}
	
	
}
