package Set_;

import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		String s1 = new String("qweqweqw");
		ts.add("hello");
		ts.add("banana");
		
		
		// Tress 에 추가되어야 하는 데이터는 비교 가능한 객체여야함
		// Comparable
		for(String str : ts) {
			System.out.println(str);
		}
		
		
		// error -> java.lang.Comparable : 넣으려는 값이 같아야한다. -> Emp 에 Comparable상속해주고 오버라이드 재정의 해준다.
		TreeSet<Emp> empSet = new TreeSet<Emp>();
		empSet.add(new Emp("1234","Foo",20000));
		empSet.add(new Emp("4564","Bar",15000));
		empSet.add(new Emp("8888","Loo",18000));
		
		for(Emp emp : empSet) {
			System.out.println(emp);
		}
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
