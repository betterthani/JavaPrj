import java.util.Scanner;

public class MultiLineInputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder lines = new StringBuilder();
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if("".equals(line.trim())) {
				break;
			} else {
				lines.append(line+ "\n");
			}
		}
		
		System.out.println(lines);
		scan.close();
	}

}
