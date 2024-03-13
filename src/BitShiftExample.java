
public class BitShiftExample {

	static void printBinStr(int i ) {
		String binStr = Integer.toBinaryString(i);
		System.out.printf("[%32s], %d\n", binStr, i);
	}
	public static void main(String[] args) {
		int x = 192;
		printBinStr(x);
		printBinStr(x << 3);
		printBinStr(x >> 3);
		System.out.println();
		int y = -192;
		printBinStr(y);
		printBinStr(y << 3);
		printBinStr(y >> 3);
		printBinStr(y >>> 3);
		printBinStr(y >>> 35); // 2번째 피연산자(35)가 첫번째(y)보다 클경우 첫번째 피연산자의 비트수의 나머지 만큼만 이동
		// 즉, 35 / 32(bit)의 나머지 3bit만큼만 오른쪽으로 이동
		
	}

}
