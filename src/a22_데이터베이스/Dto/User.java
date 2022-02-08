package a22_데이터베이스.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//<엔티티 객체>
//db에서 데이터를 가져올때 데이터를 담는 객체
//dbms의 칼럼과 같이 지정해주는것이 원칙
//User의 모든 데이터기때문에, dbms의 mst,dtl칼럼을 모두 가져옴
//어노테이션 필수
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int user_code;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String addr;
	

}
