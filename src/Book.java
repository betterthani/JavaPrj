
public class Book {
	String title;
	String author;
	int pageCount;
	
	//기본 생성자
	public Book() {
//		this.title = "Unknown Title";
//		this.author = "Unknown Author";
//		this.pageCount = 0;
		this("Unknown Title", "Unknown Author");
	}
	
	// 일부 정보만 받는 생성자
	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//		// 나머지는 기본값으로 초기화
//		this.pageCount = 0;
		this(title, author, 0);
	}
	
	// 모든 정보를 받는 생성자
	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
}
