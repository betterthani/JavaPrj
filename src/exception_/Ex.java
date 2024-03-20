package exception_;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Ex {

	public static void main(String[] args) {
		Object o = new Object();
		Person p = new Person("홍길동",33);
		Person p2 = new Person("홍길동",33);
		System.out.println(p);
		System.out.println(p == p2);
		System.out.println(p.equals(p2)); // @Data 어노테이션 삭제 전후 값 다름
		// @ToString : 디버깅
		// @Data : 객체 동등 비교
	}
	

}

@AllArgsConstructor
@Data
class Person{
	private String name;
	private int age;
	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//	@Override
//	public boolean equals(Object obj) { // object에 존재
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
}