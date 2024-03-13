import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		System.out.println("점수 : " + score);
		if(score >= 60)
			System.out.println("합격");
		
		scan.close();
	}

}
