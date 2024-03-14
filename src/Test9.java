public class Test9 {
	public static void main(String[] args) {
		// 소수 구하기 알고리즘 
		System.out.print("1부터 100사이의 소수 : ");
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
