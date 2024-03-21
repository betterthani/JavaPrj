package String_;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath(); // 경로 없음 안 만듦
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
