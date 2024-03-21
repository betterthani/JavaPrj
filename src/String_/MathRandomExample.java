package String_;

public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // random은 1.0까지 범위 속하지 않으므로 +1
		System.out.println("주사위 눈 : " + num);
	}

}
