import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		char grade;
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D'; 
		} else {
			grade = 'F';
		}
		
		System.out.printf("점수 %d는 %c등급입니다." , score, grade);
		scan.close();
	}

}
