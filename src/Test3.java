import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = add(num1, num2);
		
		System.out.printf("두 수의 합은 %d입니다.", result);
		scan.close();
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

}
