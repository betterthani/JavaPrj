package exception_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		
		read();
		String fileName = "abc.txt";
		try {
			read(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 에러메세지 화면출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void read(String fileName) throws FileNotFoundException, IOException {
		
		FileReader in = new FileReader(fileName);
		BufferedReader br = new BufferedReader(in);
		System.out.println(br.readLine());
		
	}

	public static void read() {
		String fileName = "abc.txt";
		
		try {
			
			FileReader in = new FileReader(fileName);
			BufferedReader br = new BufferedReader(in);
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException fe) {
			
			fe.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("예기치 않은 예외입니다.");
		}
		
	}

}
