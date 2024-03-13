
public class ShortCircuitExample {

	public static void main(String[] args) {
		/*
		 * ‘&&’ 연산자는 AND 연산을 수행하여 양쪽 항이 모두 true일 때만 true를 반환함. 만일 왼쪽 항이 false이면 
			오른쪽 항을 수행하지 않고 무조건 false를 반환함
			‘||’ 연산자는 OR 연산을 수행하여 양쪽 항 중 한쪽만 true여도 true를 반환함. 만일 왼쪽 항이 true이면 
			오른쪽 항을 수행하지 않고 무조건 true를 반환함
		 */
		int x = 10, y =20;
		System.out.println((x != 10) & (++y == 21)); //false
		// & 연산자는 양쪽 항다 연산하므로 y의 값은 21이 나온다.
		System.out.println("y: " + y); // 21
		
		System.out.println((x == 10) | (++y == 21)); //true
		System.out.println("y: " + y); // 22

		int a = 10, b =20;
		//&&일때 출력결과에 따라 뒷항을 연산하지 않기 때문에 b의 값은 20이 나온다.
		System.out.println((a != 10) && (++b == 21)); //false
		System.out.println("b: " + b); // 20

		System.out.println((a == 10) || (++b == 21)); //false
		System.out.println("b: " + b); // 20
	}

}
