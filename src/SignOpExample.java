
public class SignOpExample {

	public static void main(String[] args) {
		int a = 3;
		int b = - -a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int c = 3;
		int d = --c;
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		int x = 3;
		int y = -x + - --x + x--;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
