package Example;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	// 생성자
	// setter, getter
	// toString
	// hashCode & Equals
}

// value Object (VO)
// Data Transfer Object(DTO)
// 값을 갖는 객체를 만들기 위한 클래스
