import java.util.Scanner;

public class CustomerManger {
	// 배열에 저장할 수 있는 최대 고객의 수 
	static final int Max = 100;
	
	// 고객 정보를 저장할 변수를 배열로 선언
	static String [] nameList = new String[Max]; // 이름
	static char [] genderList = new char[Max]; // 성별
	static String [] emailList = new String[Max]; // 이메일
	static int [] bithYearList = new int[Max]; // 출생연도
	
	// 인덱스 초기화
	static int index = -1;
	// 배열은 처음 선언한 크기보다 같거나 적은 개수의 자료를 저장
	// 그래서 현재 데이터가 몇 개 저장되어있는지 알 수 있는 변수 선언
	static int count = 0; // 개수
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)insert, (P)previous, (N)next, (C)current, (U)update, (D)delete, (Q)quit");
			System.out.println("메뉴 입력 : ");
			String menu = scan.next();
			switch(menu.charAt(0)) {
			case 'i' :
				System.out.println("고객정보 입력을 시작합니다.");
				if(count >= Max) {
					System.out.println("더 이상 입력할 수 없습니다.");
				}else {
					insertCustomer();
					System.out.println("고객 정보를 입력했습니다.");
				}
				break;
			case 'p' :
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이터가 없습니다.");
				} else {
					index --;
					printCutomer();
				}
				break;
			case 'n' :
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {
					System.out.println("출력할 다음 데이터가 없습니다.");
				} else {
					index ++;
					printCutomer();
				}
				break;
			case 'c' :
				System.out.println("현재 데이터를 출력합니다.");
				if(index >= 0 && index < count) {
					printCutomer();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u' :
				System.out.println("데이터를 수정합니다.");
				if(index >= 0 && index < count) {
					updateCustomer();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd' :
				System.out.println("데이터를 삭제합니다.");
				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomer();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q' :
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
			default :
				System.out.println("메뉴를 잘못 입력했습니다.");
			} // end switch
		} //end while
	}

	private static void deleteCustomer() {
		for(int i = index + 1; i < count; i++) {
			nameList[i-1] = nameList[i];
			genderList[i-1] = genderList[i];
			emailList[i-1] = emailList[i];
			bithYearList[i-1] = bithYearList[i];
		}
		count--;
	}

	private static void updateCustomer() {
		System.out.println("=======UPDATE CUSTOMER INFO=======");
		System.out.println("이름 ("+ nameList[index] + ") : ");
		nameList[index] = scan.next();
		System.out.println("성별(M/F) (" + genderList[index] + ") : ");
		genderList[index] = scan.next().charAt(0);
		System.out.println("이메일  (" + emailList[index] + ") : ");
		emailList[index] = scan.next();
		System.out.println("출생년도  (" +bithYearList[index] + ") : ");
		bithYearList[index] = scan.nextInt();
	}

	private static void printCutomer() {
		System.out.println("=======CUSTOMER INFO=======");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + bithYearList[index]);
		
	}

	private static void insertCustomer() {
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.println("이메일 : ");
		String email = scan.next();
		System.out.println("출생년도 : ");
		int birthYear = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		bithYearList[count] = birthYear;
		count++; // 인원수 증가 
	}

}
