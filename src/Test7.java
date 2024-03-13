
public class Test7 {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		// 조건문 변수 할당
		int score = 1000;
		
		while (sum <= score) {
			if(n % 2 == 0) {
				sum += n;
			}
			n++;
		}
		
		System.out.println(n-1);
		
	}
	
}
