
public class MixedExample {

	public static void main(String[] args) {
		int x = 3;
		int y = ++x + x--;
		System.out.println("y : " + y);
		System.out.println("x : " + x);
		
		int a = 3;
		int b = a++ + ++a ;
		System.out.println("b: " + b);
		System.out.println("a: " + a);
	}

}
