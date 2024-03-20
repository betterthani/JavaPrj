package exception_;

import java.util.Scanner;

public class ExceptionProblemExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] greetings = {"안녕하세요", "반갑습니다.", "또 오세요."};
		
		
		while(true) {
			System.out.printf("0 이상 %d 미만의 정수를 입력하세요(99는 종료)", greetings.length);
			int index = scan.nextInt();
			
			if(index == 99) {
				System.out.println("반복문을 종료합니다.");
				break;
			}
			
			System.out.println(greetings[index]);
		}
		System.out.println("메인의 마지막입니다.");
		scan.close();
	}
}
