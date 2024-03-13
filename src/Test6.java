import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		// 1.
		if(score < 0 || score > 100) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			if(score >= 90) {
				System.out.println("A");
			} else if(score >= 80) {
				System.out.println("B");
			} else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.err.println("D");
			} else {
				System.out.println("F");
			}
			
			if(score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		
		
/*	
		//2. switch expression 기법 : break; 안 걸어도됨. 결과값 여러개일 경우 최종 반환 값 yield로 작성.
		switch (score / 10) {
			case 9 -> {
				System.out.println("A");
				System.out.println("합격"); 
				// yield
			}
			case 8 -> {
				System.out.println("B");
				System.out.println("합격");
			}
			case 7 -> {
				System.out.println("C");
				System.out.println("합격");
			}
			case 6 -> {
				System.err.println("D");
				System.out.println("합격");
			}
			case 5, 0 -> {
				System.out.println("F");
				System.out.println("불합격");
			}
			default -> {
				System.out.println("잘못 입력하였습니다.");
			}
		}

		// 3. 
		switch (score / 10) {
			case 9 :
				System.out.println("A");
				System.out.println("합격");
				break;
			case 8 :
				System.out.println("B");
				System.out.println("합격");
				break;
			case 7 :
				System.out.println("C");
				System.out.println("합격");
				break;
			case 6 :
				System.err.println("D");
				System.out.println("합격");
				break;
			case 5 : case 0 :
				System.out.println("F");
				System.out.println("불합격");
				break;
			default :
				System.out.println("잘못 입력하였습니다.");
		}
*/			
		scan.close();
		
	}

}
