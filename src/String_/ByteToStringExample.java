package String_;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] by = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(by);
		System.out.println(str1); //Hello Java
		
		String str2 = new String(by, 6, 4); // by배열의 74 (인덱스 번째), 4개
		System.out.println(str2); // Java
	
	}

}
