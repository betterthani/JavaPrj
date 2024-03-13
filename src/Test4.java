import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 밥의 주사위 게임
		Scanner scan = new Scanner(System.in);
		int diceNumber = scan.nextInt(); // 주사위 숫자
		
		System.out.println((diceNumber % 2 == 0) ? "짝수" : "홀수");
		scan.close();
	}

}
