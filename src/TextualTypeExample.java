
public class TextualTypeExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '\t';
		char c3 = '\uAC00';
		String s1 = "\uD604\uC218";
		String s2 = "dream";
		System.out.printf("%c,%c,%c,%s,%s", c1,c2,c3,s1,s2);
				
	}

}
