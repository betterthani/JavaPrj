package String_;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("300 , == 결과 : " + (obj1 == obj2));
		System.out.println("300 언박싱 후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equls 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		
		System.out.println();
		
		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("10 , == 결과 : " + (obj3 == obj4));
		System.out.println("10 언박싱 후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equls 결과 : " + obj3.equals(obj4));
		
//		[-128 ~ 127 초과값일 경우]
//		300 , == 결과 : false
//		300 언박싱 후 == 결과 : true
//		equls 결과 : true
//
//
//		[-128 ~ 127 범위값일 경우]
//		10 , == 결과 : true
//		10 언박싱 후 == 결과 : true
//		equls 결과 : true

	}

}
