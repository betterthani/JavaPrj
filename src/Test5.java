
public class Test5 {

	public static void main(String[] args) {
		// 마이크의 자동차 진단 프로그램
		int featureStatus = 12;
		
		System.out.println("2진법 : " + Integer.toBinaryString(featureStatus));
		
		featureStatus = (featureStatus >> 2) & 1; // 3번째 비트확인으로 2비트만큼 이동
		
		System.out.println("연산 결과 : " + featureStatus);
		
		if(featureStatus == 1) {
			System.out.println("3번째 기능 활성화됨");
		} else {
			System.out.println("3번째 기능 활성화 아님");
		}
		
	}

}
