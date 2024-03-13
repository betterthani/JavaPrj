import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 회전 수
		
		for(int i = 0; i < n; i++) {
			int count = scan.nextInt(); // 받아오는 값의 개수
			
			int sum = 0; // 초기화
			for(int j = 0; j < count; j++) {
				int num = scan.nextInt();
				sum += num;
			}
			System.out.println(sum);
		}
	}

}
