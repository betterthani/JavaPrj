package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		//문자열 리스트 생성
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		
		//문자열 리스트에서 길이가 5 이상인 요소 필터링
		strings.stream()
				.filter(s -> s.length() >= 5)
				.forEach(System.out::println);
		System.out.println("-------------------------");
		
		// 문자열 리스트의 요소들을 대문자로 변환하여 출력
		strings.stream()
				.map(String :: toUpperCase)
				.forEach(System.out::println);
		System.out.println("-------------------------");
		
		// 문자열 리스트의 요소들의 길이를 합산
		int totalLength = strings.stream()
								.mapToInt(String :: length)
								.sum();
		System.out.println("Total length : " + totalLength);
	}

}
