import java.util.Scanner;

public class ArrayManager {
	public static void main(String[] args) {
		// 숫자를 저장할 배열 선언 및 생성
		int []arr = new int[100];
		int index = -1; // 배열에 찾은 데이터의 위치
		int count = 0; // 배열에 저장되어 있는 데이터의 수
		
		// 메뉴를 출력하고 입력받는 코드
		// 무한루프 안에 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("=========start=========");
		while(true) {
			// 메뉴 출력
			System.out.println("1. 추가 | 2. 출력 | 3. 조회 | 4. 수정 | 5. 삭제 | 6. 삽입 | 0. 종료");
			System.out.println("입력 >>");
			int menu = scan.nextInt();

			switch (menu) {
			case 1 :
				System.out.println("데이터를 입력하세요. : ");
				int inputData = scan.nextInt();
				arr[count++] = inputData;
				break;
			case 2 :
				System.out.println("전체 출력");
				for(int i = 0; i < count; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				break;
			case 3 :
				System.out.println("조회할 데이터를 입력하세요.");
				int searchData = scan.nextInt();
				
				index = -1; // 초기화
				for(int i = 0; i < count; i++) {
					if(arr[i] == searchData) {
						index = i;
						break;
					}
				}
				if(index != -1) {
					System.out.println("데이터가 " + index +"번째 있습니다.");
				} else {
					System.out.println("데이터가 배열에 없습니다.");
				}
				break;
			case 4 :
				System.out.println("수정할 위치와 데이터를 입력하세요 (예: 2 30)");
				index = scan.nextInt();
				int updateData = scan.nextInt();
				if(index >= 0 && index < count) {
					arr[index] = updateData;
				}else {
					System.out.println("수정할 범위가 잘못되었습니다.");
				}
				break;
			case 5 :
				System.out.println("삭제할 인덱스 입력");
				index = scan.nextInt();
				for(int i = index + 1; i < count; i++) {
					arr[i-1] = arr[i];
				}
				count--; // 마지막 값은 필요없으므로 카운트 마이너스(필요없는 데이터 제외)
				break;
			case 6 :
				System.out.println("삽입할 위치와 데이터 입력하세요 (예 : 2 30)");
				index = scan.nextInt();
				int insertData = scan.nextInt();
				if(index >= 0 && index < count) {
					for(int i = count - 1; i >= index; i--) {
						arr[i+1] = arr[i];
					}
					arr[index] = insertData;
					count++;
				} else {
					System.out.println("인덱스가 잘못되었습니다.");
				}
				break;
			case 0 :
				System.out.println("종료");
				scan.close();
				System.exit(0); // 0 정상종료 , 1 비정상종료 -> 별의미 없음
			default :
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
	}
}
