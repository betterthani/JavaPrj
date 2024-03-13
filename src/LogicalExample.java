
public class LogicalExample {

	public static void main(String[] args) {
		int x = 5; 
		int y = 10;
		
		boolean condition1 = x > 0 && y < 20;
		boolean condition2 = x > 0 || y > 20;
		boolean condition3 = !(x < 0) && (y != 10);
		System.out.println("Conditon1 : " + condition1); // true
		System.out.println("Conditon2 : " + condition2); // true
		System.out.println("Conditon3 : " + condition3); // false
		
		boolean condition4 = (x > 0 && y < 20) || !(x < 0) && (y != 10);
		System.out.println("Conditon4 : " + condition4); // true
		
		
	
	}

}
