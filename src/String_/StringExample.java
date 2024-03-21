package String_;
import java.io.IOException;

public class StringExample {

	public static void main(String[] args) throws IOException {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "h";
		
		System.out.println(s1.compareTo(s5));
		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false - new 주소를 항상 바꿈
		
		// 문자열 자체가 불변객체이므로 할당해줘야한다.
		s1 = s1.toUpperCase();
		s1.toLowerCase(); // 할당 안 할시 새로운 객체가 만들어진다.
		
		System.out.println();
		
		// StringBuffered 보다 StringBuilder를 많이 사용한다. Builder는 쓰레드를 사용하지 않고 Buffered는 쓰레드 safe이다.
		// 대부분 실시간 환경으로 Builder를 다사용
		StringBuilder sb = new StringBuilder("hello");
		sb.append("world"); // 할당문 없어도 뮤터블한 객체이므로 바뀜
		System.out.println(sb);
		
		byte[] buffer = new byte[100];
		System.out.print("입력 : ");
		int readCount = System.in.read(buffer);
		System.out.println("readCount: " + readCount); // enter : 2byte
		System.out.println("byte 배열 " + buffer);
		String input = new String(buffer, 0, readCount); // buffer 배열을 0에서부터 readCount까지 넣어 문자열 만들어주세요
		System.out.println(input.trim());
		System.out.println("-----");
		
		
	}

}
