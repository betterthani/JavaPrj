import java.util.Scanner;

public class IfElseIfExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		if (score >= 90) {
			if (score > 100) {
				System.out.println("잘못 입력된 점수입니다.");
			} else {
				System.out.println("당신의 학점은 A입니다.");
			}
		} else if (score >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if (score >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if (score >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자입니다.");
		}

		scan.close();
	}

}
