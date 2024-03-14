
public class BreakExample2 {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(i == j) {
					break;
				}
				System.out.println(i + " " + j);
			} // break문 end inner for
		}// end outer for
		System.out.println("For문 실행이 종료되었습니다.");
	}

}
