package static_;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1); // 객체 생성 없이 바로 사용 가능 (이유 : static 사용)
		System.out.println(s1 == s2); //주소값 비교
		System.out.println(s2);
	}

}
