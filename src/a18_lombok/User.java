package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


//Entity 객체를 만들기 위해 lombok을 사용 --> 훨씬 용이
//기본생성자 생성
@NoArgsConstructor
//Constuctor생성
@AllArgsConstructor
//getter setter , toString 생성
@Data



public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	

	
}
