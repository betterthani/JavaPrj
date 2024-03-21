package String_;

public class StringLenthExample {

	public static void main(String[] args) {
		
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리 맞");
		} else {
			System.out.println("주민번호 자리 아님");
		}
		
		
	}

}
