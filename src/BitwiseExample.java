
public class BitwiseExample {

	public static void main(String[] args) {
		byte a = 5; // 0000_0101
		byte b = 3; // 0000_0011
		System.out.println(a&b); // 0000_0001 1
		System.out.println(a|b); // 0000_0111 7
		System.out.println(a^b); // 0000_0110 6 같으면 0, 다르면 1
	}

}
