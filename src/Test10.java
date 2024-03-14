import java.util.Scanner;

public class Test10 {
	static final int Max = 100;
	static String[] foodNameList = new String[Max]; // 식자재 이름
	static int[] amountList = new int[Max]; // 수량
	static String[] expirationDateList = new String[Max]; // 유통기한
	static String[] manufacList = new String[Max]; // 설명
	
	static int index = -1;
	static int count = 0;
	
	static Scanner scan = new Scanner(System.in);
	// 식자재 개수가 0개일 경우 db삭제
	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.print("숫자를 입력하세요: ");
			System.out.println("1 : 식자재 정보 입력 | 2 : 목록 조회 | 3 : 식자재 이름으로 조회 후 수량 수정 | 4 : 식자재 정보 삭제 | 0 : 프로그램 종료");
			int menu = scan.nextInt();
			switch(menu){
			case 1 :
				System.out.println("식자재 정보를 입력하세요.");
				if(count >= Max) {
					System.out.println("더 이상의 정보를 입력할 수 없습니다.");
				} else {
					insertFoodInfo();
					System.out.println("입력 완료되었습니다.");
				}
				break;
			case 2 :
				System.out.println("식자재 목록을 조회합니다.");
				if(count <= 0) {
					System.out.println("목록이 존재 하지 않습니다.");
				} else {
					printFood(); // 범위 설정 생각해보기
				}
				break;
			case 3 :
				if(count <= 0) {
					System.out.println("수정할 내용이 존재하지 않습니다.");
				} else {
					System.out.println("수정할 식자재 이름을 입력하세요 : ");
					String foodname = scan.next();
					updateList(foodname);
				}
				break;
			case 4 :
				if(count <= 0) {
					System.out.println("삭제할 내역이 존재하지 않습니다.");
				} else {
					System.out.println("삭제할 식자재 이름을 입력하세요 : ");
					String deletName = scan.next();
					deleteFoodInfoForName(deletName);
				}
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
			default :
				System.out.println("잘못 입력하셨습니다.");
			} // end switch
		} // while end
		
	}
	
	// 이름을 가지고 삭제
	private static void deleteFoodInfoForName(String deletName) {
		for(int i = 0; i < count; i++) {
			if(foodNameList[i].equals(deletName)) {
				deletList(i);
				break;
			} else {
				System.out.println("해당 이름을 가진 내역이 존재하지 않습니다.");
			}
		}
	}
	
	// 이름을 가지고 update
	private static void updateList(String foodname) {
		for(int i = 0; i < count; i++) {
			if(foodNameList[i].equals(foodname)) {
				System.out.println("수정할 내용을 입력해주세요.");
				System.out.print("식자재 이름 : ");
				foodNameList[i] = scan.next();
				System.out.print("식자재 수량 : ");
				amountList[i] = scan.nextInt();
				if(amountList[i] == 0) {
					// 수량이 0일 경우 삭제
					deletList(i);
					break;
				}
				System.out.print("유통기한 : ");
				expirationDateList[i] = scan.next();
				System.out.print("설명 : ");
				manufacList[i] = scan.next();
				break;
			} else {
				System.out.println("해당 이름을 가진 내역이 존재하지 않습니다.");
			}
		}
		
	}
	
	// index 번째를 이용한 내용 삭제
	private static void deletList(int indexNum) {
		foodNameList[indexNum] = "";
		amountList[indexNum] = 0;
		expirationDateList[indexNum] =  "";
		manufacList[indexNum] =  "";
		count--;
		System.out.println("삭제 되었습니다.");
	}
	
	// 목록 출력
	private static void printFood() {
		System.out.println("====Food List====");
		for(int i = 0 ;i < count; i++) {
			System.out.print("식자재 이름 : ");
			System.out.println(foodNameList[i]);
			System.out.print("식자재 수량 : ");
			System.out.println(amountList[i]);
			System.out.print("유통기한 : ");
			System.out.println(expirationDateList[i]);
			System.out.print("설명 : ");
			System.out.println(manufacList[i]);
		}
		
	}
	
	// insert
	private static void insertFoodInfo() {
		System.out.println("식자재 이름 : ");
		foodNameList[count] = scan.next();
		System.out.println("식자재 수량 : ");
		amountList[count] = scan.nextInt();
		System.out.println("식자재 유통기한 : ");
		expirationDateList[count] = scan.next();
		System.out.println("식자재 설명 : ");
		manufacList[count++] = scan.next(); // count 증가
	}

}
