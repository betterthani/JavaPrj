package stream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class FileIOEcample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("test1.txt");
		String str = new String("Hello");
		byte[] bytes = str.getBytes();
		
		os.write(bytes); // byte배열로 넣어줌
		os.close(); // write도중에 멈추면 안닫히므로 fileOutputStream 쓸때 throws 가 아닌 try-catch문 작성하는게 좋다
		System.out.println("파일에 저장되었습니다.");
		
		Writer out = new FileWriter("test2.txt"); 
		out.write("안녕하세요 반갑습니다.");
		out.close();
		System.out.println("파일에 저장되었습니다.");
		System.out.println("---------------");
		
		// 파일 읽어드릴때
		InputStream is = new FileInputStream("test1.txt"); // byte단위 읽어드리기
		byte[] buffer = new byte[3]; // 한번에 3byte씩 읽어들인다.
		int readCount = 0;
		
		// 읽어드린거
		StringBuilder sb = new StringBuilder();
		
		// 글이 3byte이상일수 있으므로 while문 돌리기
		while (readCount > 0) {
			readCount = is.read(buffer); // 한번 읽을떄마다 3byte(Hel)까지 읽힘
			sb.append(new String(buffer, 0, readCount));
		}
				
//		System.out.println(new String(buffer, 0, readCount)); // 0 ~ readCount까지 
		System.out.println(sb.toString());
		is.close(); // 닫기
	}

}
