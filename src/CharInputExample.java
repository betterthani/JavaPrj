import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharInputExample {

	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		int keyCode = reader.read();
		System.out.println(keyCode);
		System.out.println((char)keyCode);
	}

}
