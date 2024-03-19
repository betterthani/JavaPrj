package lambda;

import java.util.function.Function;

public class MethodRefereceExample {
	// 정적 메소드 참조 
	
	// 정적 메서드
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}


	public static void main(String[] args) {
		
		// 람다 표현식 사용한 방법
		Function<String, String> lambda = (str) -> toUpperCase(str); // 정적 메서드로 객체 따로 생성 필요 없이 바로 호출 가능

		// 메서드 참조를 사용한 벙법
		Function<String, String> reference = MethodRefereceExample::toUpperCase;

		System.out.println(lambda.apply("Hello"));
		System.out.println(reference.apply("world"));

	}
}
