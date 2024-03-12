
public class Test1 {
	static int myFunction(int x) {
		// 지역변수 4개 (매개변수도 포함)
		int y = 0;
		int a = 3;
		int b = 10;
		y = a * x + b;
		return y;
	}
	public static void main(String[] args) {
		
		int result = myFunction(10);
		System.out.println(result);

	}
}
