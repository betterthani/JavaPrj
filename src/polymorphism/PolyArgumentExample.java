package polymorphism;

public class PolyArgumentExample {

	public static void main(String[] args) {
		Student s = new Student("허현수", 28, "200112345");
		printPersonInfo(s);
		
		Teacher t = new Teacher("허현준", 22, "Java");
		printPersonInfo(t);
		
		Employee e = new Employee("허현정", 55, "교무처");
		printPersonInfo(e);
	}

	private static void printPersonInfo(Person p) { // Person의 하위 클래스 될 수 있음
		/*
		System.out.println("************Person Info ***********");
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("***********************************\n");
		*/
		if(p instanceof Student) {
			System.out.println("***************Student Info************");
		} else if(p instanceof Teacher) {
			System.out.println("***************Teacher Info************");
		} else if(p instanceof Employee) {
			System.out.println("***************Employee Info************");
 		} else {
 			System.out.println("***************Person Info************");
 		}
	}

}
