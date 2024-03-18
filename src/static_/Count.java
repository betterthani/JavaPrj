package static_;

public class Count {
	public int a = 0; // 인스턴스 변수
	public static int b = 0; // 클래스 변수
	
	public static int doIt() {
		// return ++a; // 객체를 만들고 사용해야하기 때문에 ++new Count().a 형식은 가능
		return ++b;
	}
	
}
