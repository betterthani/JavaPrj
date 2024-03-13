import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		System.out.println("점수 : " + score);
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		scan.close();
	}

}
