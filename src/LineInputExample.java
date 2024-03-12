import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LineInputExample {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		String line = in.readLine();
		System.out.println(line);
		in.close();
	}

}
