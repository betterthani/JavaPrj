
public class StringPlusExample {

	public static void main(String[] args) {
		String s1 = "Sun";
		String s2 = "day";
		int a = 20;
		int b = 30;
		
		System.out.println(s1+s2);
		System.out.println(s1 + a);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		
		// String사용시 +로 연결했을 경우 힙영역에 계속 주소값이 쌓여 비추, StringBuilder나 다른걸 이용 추천
		
		
	}

}
