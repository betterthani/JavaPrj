package interface_;

public class InterFaceImpelmentExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		ITodo3 itodo3 = todo;
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4(); // error - IToDo3 에는 m4()가 없음 전혀 상관없음
		IToDo4 itodo4 = todo;
		itodo4.m4();
	}

}
