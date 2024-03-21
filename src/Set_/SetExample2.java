package Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		strSet.add("Hello");
		strSet.add("World");
		System.out.println(strSet.add("Hello"));
		
		System.out.println(strSet);
		
		for(String str : strSet) {
			System.out.println(str);
		}
		
		System.out.println("******************");
		Iterator<String> iter = strSet.iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			System.out.println(a);
		}
		System.out.println("******************");
		
		
		Set<Emp> empSet = new HashSet<Emp>();
		empSet.add(new Emp("1123", "Joe", 10000)); // Emp에 @Data에 hashcode도 있어야함 set메서드 hashcode로 한번 비교, 그다음에 equals로 또 비교 hashcode같은데 equals와 다르면 넣고 반대면 넣는다.
		// add : hashcode로 먼저 비교한 후 같다면 equals와 다시 비교 @Data 가 있어야 hashcode가 있으므로 중복값이 안 들어가게 된다. 그냥 getter, setter로 했을 경우에 3개 다 들어감
		
		empSet.add(new Emp("1123", "Joe", 10000));
		empSet.add(new Emp("1453", "Foo", 15000));
		System.out.println(empSet);
	}

}
