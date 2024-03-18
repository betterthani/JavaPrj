package modifier.otherpac;

import modifier.pac.Super;

public class Sub extends Super{
	
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
		//System.out.println("Super num3 = " + num3); // error : 다른 패키지
		//System.out.println("Super num4 = " + num4); // error : 다른 패키지
		System.out.println("Super num4 = " + getNum4());
		System.out.println("Super num5 = " + num5);
		
	}
}
