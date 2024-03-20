import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor // 기본 생성자 
@Getter
@Setter // getter, setter 대신 @Data 작성해도됨

public class Employee {
	private int employeeId;
	private String name;
	private String email;
	private String phoneNumber;
	private String jobId;
	private double salary;
}
