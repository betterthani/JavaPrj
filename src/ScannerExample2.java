import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름, 나이 입력하세요");
		System.out.println("나이 : ");
		age = Integer.parseInt(scan.nextInt());
		System.out.println("이름 : ");
		name = scan.nextLine();
		
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		scan.close();
	}

}
