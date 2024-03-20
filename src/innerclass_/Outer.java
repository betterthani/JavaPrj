package innerclass_;

public class Outer {
	
	class Inner {
		void doThat() {
			System.out.println("Inner.doThat");
		}
	}
	
	// 같은 클래스 안에서 생성자 생성 가능
	// SomeOther클래스는 다름
	public void doIt() {
		Inner in = new Inner();
		in.doThat();
	}
	
}
