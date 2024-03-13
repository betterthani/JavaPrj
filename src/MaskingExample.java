
public class MaskingExample {

	public static void main(String[] args) {
		/*
		 * 마스크(Mask) 연산에는 주로 비트 연산자 & 또는 |, 그리고 0x00 또는 0xFF 등의 값을 사용하여 이는 특정 바이트(또는
		 * 비트)를 추출하거나 설정하는 데 사용
		 */
		int orignalValue = 0xABCD1234;
		int extractedByte = orignalValue & 0xFF;

		// toHexString : 16진수 표기
		System.out.println("원본 값 : " + Integer.toHexString(orignalValue));
		System.out.println("최하위 바이트 추출 : " + Integer.toHexString(extractedByte));
	}

}
