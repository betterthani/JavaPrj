package String_;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] by = new byte[100];
		
		System.out.println("입력 :  ");
		int resdByteNo = System.in.read(by);
		
		String str = new String (by, 0, resdByteNo);
		System.out.println(str.trim());
		
	}

}
