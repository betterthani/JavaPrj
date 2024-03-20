package innerclass_;

public class SomeOther {

	public static void main(String[] args) {
		//Outer out = new Outer(); // 내부 클래스를 포함하는 외부 클래스 인스턴스 생성
		//Outer.Inner in = out.new Inner(); // 외부 클래스의 인스턴스를 통해 내부 클래스 객체 생성
		
		// 위의 두 줄을 합친 것
		Outer.Inner in = new Outer().new Inner();
		in.doThat();
		
		Outer out = new Outer();
		out.new Inner().doThat();
	}
}
