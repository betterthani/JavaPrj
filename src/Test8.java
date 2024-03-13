import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 회전 수
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt(); // 받아오는 값의 개수
			int[] arr = new int[a];
			
			int sum = 0; // 초기화
			for(int j = 0; j < a; j++) {
				arr[j] = scan.nextInt();
				sum += arr[j];
			}
			System.out.println(sum);
		}
	}

}
