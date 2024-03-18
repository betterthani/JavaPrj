import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {

	public static void main(String[] args) {
		var myList = new ArrayList<String>();
		System.out.println(myList.size()); // 0
		
		var str = "Hello";
		var x = 10; // int로 추론
		x = 20;
		
//		var x = "hello"; // error : 이미 var선언
		System.out.println(str + " " + x); // Hello 20
		
		List<String>myList2 = new ArrayList<>(); // 제네릭 타입 추론
		System.out.println(myList2); // [] <- 빈 리스트
		
		MyFuntion myFunc = (s) -> s.length(); // 람다식에 타입추론 사용
		System.out.println(myFunc.myMethod("Hello"));
		
		
	}

}
