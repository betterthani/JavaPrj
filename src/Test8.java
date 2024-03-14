import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		
		for(int i = 0; i < n; i++) {
			int count = scan.nextInt(); 
			
			int sum = 0; 
			for(int j = 0; j < count; j++) {
				int num = scan.nextInt();
				sum += num;
			}
			System.out.println("#"+ (i+1) + " " + sum);
		}
		
		scan.close();
	}

}
