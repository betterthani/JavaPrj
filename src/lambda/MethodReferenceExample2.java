package lambda;

import java.util.function.Function;

public class MethodReferenceExample2 {
	// 인스턴스 메서드 참조 
	
	// 인스턴스 메서드
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
	
	public static void main(String[] args) {
		
		MethodReferenceExample2 instance = new MethodReferenceExample2();
		
		// 람다식 표현
		Function<String, String> lambda = (str) -> instance.toUpperCase(str); // 객체 생성 후 불러오기
		
		// 메서드 참조를 사용한 방법
		Function<String, String> reference = instance::toUpperCase;
		
		System.out.println(lambda.apply("hello"));
		System.out.println(reference.apply("world"));
	}

}
