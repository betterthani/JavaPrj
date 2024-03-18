
public class GenericExample {

	public static void main(String[] args) {
		Box2<String> stringBox = new Box2<String>();
		stringBox.setValue("Hello, java!");
		
		Box2<Integer> intBox = new Box2<Integer>();
		intBox.setValue(42);
		
		String stringValue = stringBox.getValue(); // 형변환 불필요
		int intValue = intBox.getValue();
		System.out.println(stringValue + " " + intValue);
		
	}

}
