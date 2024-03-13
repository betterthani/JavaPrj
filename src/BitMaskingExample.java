
public class BitMaskingExample {

	public static void main(String[] args) {
		int pixel = 0xFF07896; // Alpha :FF, Red : F0, Green:78, Blue :96
		int blue = pixel & 0x000000FF; // Blue 값만 빼고싶은 경우
		System.out.printf("16진수 %x, 10진수 %d \n", blue, blue);
		
		int red = pixel & 0x00FF0000;
		red = red >> 16; // red 성분은 비트 이동 연산자를 이용하여야함
		System.out.printf("16진수 %x, 10진수 %d \n", red, red);
	
	}

}
