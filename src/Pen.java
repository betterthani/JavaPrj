
public class Pen {
	private String color = "검정";
	private int price;

	public void write(int count) {
		
		int data = 1;
		System.out.println("멤버변수 : " + price);
		System.out.println("지역변수 : " + data);
		System.out.println("매개변수 : " + count);
		System.out.println("Hello World!");
	}
}
