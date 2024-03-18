
public class CalsulatorExample {

	public static void main(String[] args) {
		Calsulator calc = new Calsulator();
		System.out.println(calc.sum(3,4));
		System.out.println(calc.sum(3,4,5));
		System.out.println(calc.sum(3,4,5,6)); // 파라미터가 배열일 경우 error
//		System.out.println(calc.sum(new int[] {3,4,5,6}) );
		
	}

}
