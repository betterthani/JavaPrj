package exception_;

import java.sql.SQLException;

public class EmpService implements IEmpService{
	// 재정의 메서드는 부모의 메서드 (IEmpService interface의 insert메서드)
	// 가 throws 하지 않은 새로운 예외는 throws할 수 없으므로

	@Override
	public void insert(EmpVo vo) {
		try {
			if(vo == null) {
				throw new SQLException("객체가 NULL입니다.");
			} // if블럭을 수정하지 않고 예외처리 해야함
		} catch (SQLException e) {
			// insert() 메서드 호출하는 곳에서 RuntimeException 처리하면 된다.
			throw new RuntimeException(e);
			// RuntimeException = Java Virtual Machine의 정상적인 작동 중에 발생할 수 있는 예외의 슈퍼 클래스
		}
	}
	
	
}
