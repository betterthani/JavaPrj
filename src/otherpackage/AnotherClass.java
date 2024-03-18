package otherpackage;

import mypackage.MyClass;

public class AnotherClass {
	public static void main(String[] args) {
		MyClass myObject = new MyClass();

		//myObject.packagePrivateMethod(); //-> default 지정자이기 때문에 접근 불가.
	}
}
