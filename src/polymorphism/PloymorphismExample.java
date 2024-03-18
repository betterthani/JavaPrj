package polymorphism;

public class PloymorphismExample {
	public static void main(String[] args) {
		Person p;
		
		p = new Student("허현수", 17, "20160001");
		System.out.println(p.getDetails());
		
		p = new Teacher("허현준", 22, "Java Programming");
		System.out.println(p.getDetails());
		
		p = new Employee("허현정", 23, "교무처");
		System.out.println(p.getDetails());
	}
}
