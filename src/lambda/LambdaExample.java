package lambda;

import java.util.Arrays;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 정렬할 문자열 배열
		String[] names = {"Alice", "Bob", "Charlie", "David"};
		
		// 람다식 표현식을 사용하여 문자열 배열을 길이순으로 정렬
		Arrays.sort(names, (a,b) -> a.length() - b.length());
		
		// 정렬된 배열 출력
		for(String name : names) {
			System.out.println(name);
		}
	}

}
