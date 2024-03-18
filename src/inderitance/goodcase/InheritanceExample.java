package inderitance.goodcase;

public class InheritanceExample {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		p.age = 25;
		System.out.println(p.getDetails());
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId = "20001234";
		System.out.println(s.getDetails());
		
		Teacher t = new Teacher();
		t.name ="강감찬";
		t.age = 40;
		t.subject = "자바 프로그래밍";
		System.out.println(t.getDetails());
		
		Employee e = new Employee();
		e.name = "최경주";
		e.age = 30;
		e.department ="교무처";
		System.out.println(e.getDetails());
	}

}
