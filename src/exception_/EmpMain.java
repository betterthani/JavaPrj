package exception_;

public class EmpMain {
	public static void main(String[] args) {
		IEmpService empService = new EmpService();
		// 예외는 원인을 제공하는 곳에서 try - catch 블록으로 처리해야한다.
		try {
			empService.insert(null);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("메인 종료");
	}
}
