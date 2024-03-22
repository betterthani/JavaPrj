package enum_;

public enum Coin {
	// 값 초기화
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25);
	
	// 멤버변수
	private int value;
	
	// 생성자
	Coin(int value){
		this.value = value;
	}
	
	// 값 반환 메서드 - getter
	int getValue() {
		return value;
	}

	// enum 타입이 숫자로 매핑시켜서 사용하는 방법이다.
}
