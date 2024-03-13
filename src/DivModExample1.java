
public class DivModExample1 {
	public static void main(String[] args) {
		int num = 45;
		int tensDigit = num / 10; // 십의 자리
		int unitsDigit = num % 10; // 일의 자리
		int sum = tensDigit + unitsDigit;
		System.out.println("각 자리수의 합 : "+ sum);
	}
}
