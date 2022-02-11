package a24_윈도우빌더.Dto;
//UserDto 지만 엔티티 객체. 즉, DB와 소통하는 객체는 Dto를 생략하는 경우가 많음

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int user_code;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String addr;

}
