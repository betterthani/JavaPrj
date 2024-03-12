import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String email;
		int age;
		double weight;
		System.out.println("이름, 이메일, 나이, 몸무게 입력하세요");
		System.out.println("입력>");
		name = scan.next();
		email = scan.next();
		age = scan.nextInt();
		weight = scan.nextDouble();
		
		System.out.println("이름 :" + name);
		System.out.println("이메일 :" + email);
		System.out.println("나이 :" + age);
		System.out.println("몸무게 :" + weight);
		scan.close();
	}

}
