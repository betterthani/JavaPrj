package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Emp> myMap = new HashMap<>();
		myMap.put("foo", new Emp("1111", "foo", 12345));
		myMap.put("lle", new Emp("2222", "gefe", 1111));
		myMap.put("fff", new Emp("12223", "err", 2222));
		
		Emp emp = myMap.get("foo");
		System.out.println(emp);
		System.out.println("///////////////////////////");
		
		// 전체 데이터 순회
		//entry 이용하여 순회
		for(Map.Entry<String, Emp> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("///////////////////////////");
		
		// key로 전체 돌리기
		for(String key : myMap.keySet()) {
			System.out.println(key + " " + myMap.get(key));
		}
		
		System.out.println("///////////////////////////");
		// iterator를 이용하여 돌리기
		Set<String> keySet = myMap.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.println(key + " " + myMap.get(key));
		}
	}
}
