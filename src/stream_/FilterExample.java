package stream_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FilterExample {

	public static void main(String[] args) {
		// 데이터 저장하는 3가지 방법
		Member m = new Member("홍길동", "hong@hong.com", 30, "서울시 강동구"); // 저장할 값
		Member m2 = new Member("홍길서", "west@hong.com", 30, "서울시 강서구"); // 저장할 값

		ArrayList<Member> memberList = new ArrayList<Member>();
		memberList.add(m);
		memberList.add(m2);
		
		// 파일에 저장, File이 노드가 됨.
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("member.txt");
			fos = new FileOutputStream("member.data");
			
//			BufferedOutputStream bos = new BufferedOutputStream(fos); // 좀 더 buffered를 사용하여 빠르게 저장할 수 있다.
//			bos.write(m.toJSON().getBytes());
//			bos.write("\n".getBytes()); // 띄어쓰기
//			bos.write(m2.toJSON().getBytes());
//			bos.flush();
			
//			DataOutputStream dos = new DataOutputStream(fos);
//			dos.writeUTF(m.getName());
//			dos.writeUTF(m.getEmail());
//			dos.writeInt(m.getAge());
//			dos.writeUTF(m.getAddress());
//			dos.flush();
			
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 조건, 직렬화 가능한 객체여야한다.
			oos.writeObject(memberList);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try { fos.close(); } catch (IOException e) { }
		}
		System.out.println("저장완료");
		
		// 파일 불러오기
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream("member.txt");
			fis = new FileInputStream("member.data");
			
			// 단순 텍스트 읽어들이기
//			BufferedInputStream bis = new BufferedInputStream(fis); // readLine() 메서드 존재 하지 않음 그래서 bufferedReader사용
//			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//			String line = br.readLine();
//			String [] tokens = line.split(",");
//			String name = tokens[0];
//			String email = tokens[1];
//			int age = Integer.parseInt(tokens[2]);
//			String address = tokens[3];
			
//			Member m1 = new Member(name, email, age, address);
			
//			DataInputStream dis = new DataInputStream(fis);
//			String name = dis.readUTF();
//			String email = dis.readUTF();
//			int age = dis.readInt();
//			String address = dis.readUTF();
//			Member m1 = new Member(name, email, age, address);
			
//			System.out.println(m1.toString());
			
			ObjectInputStream oos = new ObjectInputStream(fis);
			ArrayList<Member> list = (ArrayList<Member>)oos.readObject();
			for(Member m3 : list) {
				System.out.println(m3.toString());
			}
			
			
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}finally {
			try {fis.close();} catch(Exception e) {}
		}
	}
}

@Data
@AllArgsConstructor
class Member implements Serializable{ 
	/**
	 * generated serial ID
	 * 한번객체를 저장했는데 나중에 객체를 만들었던 클래스 구조가 바뀌더라도 같은 클래스로 인식 시키기 위해서 사용한다.
	 */
	private static final long serialVersionUID = 139268326009748834L;
// 직렬화 가능한 객체
	private String name;
	private String email;
	private int age;
	private String address;
	
	public String toJSON() {
		return name + "," + email + "," + age + "," + address;
	}
}
