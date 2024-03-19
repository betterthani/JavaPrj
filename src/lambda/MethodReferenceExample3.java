package lambda;

import java.util.function.Supplier;

public class MethodReferenceExample3 {
	// 생성자 참조
	
	//생성자
	public MethodReferenceExample3() {
		System.out.println("Constructor called");
	}
	
	public static void main(String[] args) {
		
		// 람다식
		Supplier<MethodReferenceExample3> lambda = () -> new MethodReferenceExample3();
		
		// 생성자 참조를 사용한 방법
		Supplier<MethodReferenceExample3> reference = MethodReferenceExample3::new;
		
		lambda.get(); // 생성자 호출
		reference.get(); // 생성자 호출
		
	}

}
