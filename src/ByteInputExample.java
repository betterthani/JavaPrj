import java.io.IOException;

public class ByteInputExample {

	public static void main(String[] args) throws IOException {
		int keyCode = System.in.read();
		System.out.println(keyCode);
		System.out.printf("%c", keyCode);
	}

}
