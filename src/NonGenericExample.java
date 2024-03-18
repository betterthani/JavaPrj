
public class NonGenericExample {

	public static void main(String[] args) {
		Box1 stringBox = new Box1();
		stringBox.setValue("Hello, java");
		
		Box1 intBox = new Box1();
		intBox.setValue(42);
		
		String stringValue = (String)stringBox.getValue(); // 형변환 필요
		int intValue = (int)intBox.getValue();
		System.out.println(stringValue + " " + intValue);
	}

}
