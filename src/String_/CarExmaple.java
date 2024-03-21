package String_;

import javax.annotation.processing.AbstractProcessor;

public class CarExmaple {

	public static void main(String[] args) throws ClassNotFoundException {
		// 객체얻기
		//첫번째 방법
		Class clzz = Car.class;
		
		// 2번째 방법
		Class clzz2 = Class.forName("String_.Car");
		
		// 3번째 방법
		Car car = new Car();
		Class clzz3 = car.getClass();
		
		System.out.println(clzz.getName());
		System.out.println(clzz.getSimpleName());
		System.out.println(clzz.getPackageName());
	}

}
