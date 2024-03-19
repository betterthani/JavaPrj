package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperationExample {

	public static void main(String[] args) {
		/*
		 * 참조타입 :: 메서드명 = (파라미터) -> {구현부}
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 6, 7, 8, 9, 10,3,4,5);

		// 순회
		System.out.println("순회 : ");
		numbers.stream().forEach(System.out::println);
		System.out.println("-------------------------");
		
		// 정렬
		System.out.println("정렬 : ");
		numbers.stream()
				.sorted()
				.forEach(System.out::println);
		System.out.println("-------------------------");
		
		// 필터링
		System.out.println("짝수 필터링 : ");
		numbers.stream()
				.filter(n -> n % 2 == 0)
				.sorted()
				.forEach(System.out :: println);
		System.out.println("-------------------------");
		
		// 매핑
		System.out.println("제곱 값 매핑 : ");
		numbers.stream()
				.map(n -> n * n)
				.forEach(System.out :: println);
		System.out.println("-------------------------");
		
		// 집계
		System.out.println("합계 : ");
		int sum = numbers.stream()
					.reduce(0, Integer::sum);
		System.out.println(sum);
		System.out.println("-------------------------");
		
		// 그룹핑
		System.out.println("나머지에 따른 그룹핑 : ");
		Map<Integer, List<Integer>> groupByRemainder = numbers.stream()
				.sorted()
				.collect(Collectors.groupingBy(n -> n % 3));
		System.out.println(groupByRemainder);
		
	}

}
