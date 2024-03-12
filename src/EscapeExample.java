
public class EscapeExample {

	public static void main(String[] args) {
		String str1 = "Hello\tWolrd\n반값습니다.";
		System.out.println(str1);
		String str2 = "HelloWorld\r123456";
		System.out.println(str2);
		
		String multiLineStr = """
				여러 줄 문자열을 표현할 수 있습니다.
				주로 JSON 데이터 또는 <HTML> 태그를 표현할때 사용합니다.
				탭 키와 ",' 를 위해 탈출문자를 사용하지 않아도 됩니다.
				//는 여전히 탈출문자로 사용해야 합니다.
				\n(\\n)은 사용 가능하지만 코드에서 줄바꿈 해도 됩니다.
				되도록이면 들여쓰기 레벨은 같게 하세요.
				""";
		System.out.println(multiLineStr);
				
				
				
	}

}
