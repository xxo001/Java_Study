package a20_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String username;
	private String password;
}

//여러 클래스를 만들때, 어노테이션도 따로 해주어야 함 
@Data
@NoArgsConstructor
@AllArgsConstructor
class PersonalUser extends User{
	private String personal_name;
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class CompanyUser extends User{
	private String company_name;
}

