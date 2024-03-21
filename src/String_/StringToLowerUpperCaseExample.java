package String_;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); //false
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2)); //true -> 대소문자 맞춰야 하지만
		System.out.println(str1.equalsIgnoreCase(str2)); //true -> 대소문자 맞추지 않아도 된다.
		
	}

}
