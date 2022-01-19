package a17_기본클래스;

public class UserTest {

	public static void main(String[] args) {
		//로그인 프로그램 --> 입력된 아이디 비밀번호와 , 데이터로 저장된 아이디 비밀번호가 같은지 비교 후 로그인
		//hashcode로 리터럴값을 변환하여 비교하기에, 가능
		User user = new User();
		user.setUsername("jaehyeon");
		user.setPassword("1234");
		
		User dbUser = new User();
		dbUser.setUsername("jaehyeon");
		dbUser.setPassword("1234");
		
		System.out.println(user.equals(dbUser));
		

	}

}
