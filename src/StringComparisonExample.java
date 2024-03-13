
public class StringComparisonExample {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		// String == 주소값 비교로 다름.
		System.out.println("Using == operator : ");
		System.out.println(str1 == str2);
		System.out.println("Using != operator : ");
		System.out.println(str1 != str2);
	}

}
