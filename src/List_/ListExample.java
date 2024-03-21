package List_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("World");
		myList.add(1,"Nice");
		System.out.println(myList);
		
		List<String> myList2 = new LinkedList<String>();
		myList2.add("Hello");
		myList2.add("World");
		myList2.add(1,"Nice");
		System.out.println(myList2);
		
		List empList = new ArrayList();
		empList.add(new Emp("1221","Foo", 1000));
		empList.add("Hello");
		
		Object emp = empList.get(0);
		System.out.println(emp.toString());
//		System.out.println(emp.getSalary()); // 다형성에서 선언한 파일에 메서드가 있는지 체크 없으니깐 에러뜸(Object형이므로 없음)
		if(emp instanceof Emp) {
			System.out.println(((Emp)emp).getSalary());
		}
		
		// java 14버전 이상에서 돌아감.
//		if(emp instanceof Emp emp_) {
//			System.out.println(emp_.getSalary());
//		}
		
		Emp emp2 = (Emp)empList.get(0);
		System.out.println(emp2.toString());
		System.out.println(emp2.getSalary());
		
	}
}
@AllArgsConstructor
@Data
class Emp implements Comparable<Emp>{
	private String empId;
	private String ename;
	private double salary;
	
	@Override
	public int compareTo(Emp o) {
		
//		return 0; // 객체 정렬하는데 사용
		
		// 정렬하고 싶은거를 지정해서 작성 - 사원의 아이디
//		return empId.compareTo(o.empId);
		
		// 급여 순
//		return (int)(this.salary - o.salary);
		
		// 이름순
		return ename.compareTo(o.ename);
	}
}

