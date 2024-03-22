package enum_;

public class EnumExample {

	public static void main(String[] args) {
		Coin coin = Coin.NICKEL;
		System.out.println(coin); // NICKEL : 상수로 나옴
		System.out.println(coin.getValue()); // 5 : 값이 얼마야
		
		buy(coin); // 구매 완료 2
		buy(coin.getValue()); // 구매 완료
		buy(5); // enum 사용 전 , 구매 완료 
		
		
	}
	
	// 정수형 매개변수 사용 - 레거시 메서드 (이전 사용)
	public static void buy(int coin) {
		System.out.println("구매 완료");

		// 레거시를 버릴 수 없다는 가정시 호출
		System.out.println("복잡하고 새로 구현할 수 없는 기능, 버릴 순 없어");
	}
	
	// enum형 매개변수 사용 - 신규 기능
	public static void buy(Coin coin) {
		
		System.out.println("구매 완료 2");

		// 레거시를 버릴 수 없으때 사용하는 방법 호출
		buy(coin.getValue()); // buy(coin)의 호출을 받고 이 getValue는 위의 int 매개변수가 있는 메서드를 호출해준다.
	}
	

}
