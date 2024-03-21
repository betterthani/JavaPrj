package Example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodManager {

	static List<Food> foodList = new ArrayList<>();
	
	static Scanner scanner = new Scanner(System.in);

	private static void insertFood() {
		
		System.out.print("이름:"); 
		String name = scanner.next();
		System.out.print("수량:"); 
		int count = scanner.nextInt();
		System.out.print("유통기한:"); 
		String expDate = scanner.next();
		System.out.print("설명:"); 
		String desc = scanner.next();
		foodList.add(new Food(name, count, expDate, desc));
		
	}//end insertFood()

	private static void printFoodList() {
		System.out.println("----------------------------------------");
		System.out.println("이름\t수량\t유통기한\t설명");
		System.out.println("----------------------------------------");
		for(int i = 0; i < foodList.size(); i++) {
			Food food0 = foodList.get(i);
			System.out.printf("%s\t%d\t%s\t%s\n", food0.getName(), food0.getCount(), food0.getExpDate(), food0.getDesc());
			
		}
		System.out.println("----------------------------------------");
	}//end printFoodList()


	private static void updateFoodCount() {
		System.out.print("수정할 식자재 이름을 입력하세요:");
		String food = scanner.next();
		for(int i=0; i<foodList.size(); i++) {
			Food food1 = foodList.get(i);
			if(food1.getName().equals(food)) {
				System.out.print("수량을 입력하세요:");
				int cnt = scanner.nextInt();
				if(cnt==0) {
					for(int j=i; j<foodList.size()-1; j++) {
						foodList.remove(j);
					}
				}else {
					food1.setCount(cnt);
				}
				System.out.println(food + " 식자재가 수정되었습니다.");
				return; //break; 하면 안 됨
			}//end if
		}//end for
		System.out.println("수정할 식자재가 없습니다.");
	}//end updateFoodCount()

	private static void deleteFood() {
		System.out.print("삭제할 식자재 이름을 입력하세요:");
		String food = scanner.next();
		for(int i = 0; i < foodList.size(); i++) {
			Food food2 = foodList.get(i);
			
			if(food2.getName().equals(food)) {
				foodList.remove(i);
				System.out.println(food + " 식자재가 삭제되었습니다.");
				return; //break; 하면 안 됨
			}
		}
		System.out.println("삭제할 식자재가 없습니다.");
	}//end deleteFood()



	public static void main(String[] args) {
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.추가, 2.목록보기, 3.수정, 4.삭제, 0.종료");
			System.out.print("메뉴:");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("새로운 식자재를 추가합니다.");
				insertFood();
				break;
			case 2:
				System.out.println("식자재 목록을 출력합니다.");
				printFoodList();
				break;
			case 3:
				System.out.println("식자재 정보를 수정합니다.");
				updateFoodCount();
				break;
			case 4:
				System.out.println("식자재 정보를 삭제합니다.");
				deleteFood();
				break;
			case 0:
				System.out.println("식자재 관리 프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못된 메뉴입니다.");
				break;
			}//end switch
		}//end while

	}//end main
}//end class
