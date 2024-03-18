package modifier;

import modifier.otherpac.Sub;
import modifier.pac.Super;

public class ModifierExample {

	public static void main(String[] args) {
		System.out.println("******Super 참조 ******");
		Super sup = new Super();
		System.out.println("num1 = " + sup.num1
							//+ "\tnum2 = " + sup.num2 // error : 상속 관계가 아님, 다른 패키지
							//+ "\tnum3 = " + sup.num3 // error : 다른 패키지
							+ "\tnum3 = " + sup.getNum4()
						  );
		System.out.println("\n****** Sub 참조 ******");
		Sub sub = new Sub();
		sub.print();
	}

}
