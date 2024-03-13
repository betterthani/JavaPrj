
public class RemaiderExample {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
			}
		}
		
		for(double i = 0.1; i < 1; i = i + 0.1) {
			if(i % 0.3 == 0) {
				System.out.println("0.3의 배수 : " + i);
			}
		}
		
		System.out.println(3.5%0.3);
	}

}
