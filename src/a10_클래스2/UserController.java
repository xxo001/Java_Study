package a10_클래스2;
//User클래스들을 이용한 프로그래밍 --> main
public class UserController {

	public static void main(String[] args) {
		//userService를 실행하여 scanner사용 --> 새로운UserService를 생성하여 userService에 저장 --> 이것을 사용하겠다
		UserService userService = new UserService();
		
		//User배열 사용
		//userServie에 있는 setUserAraay를 실행시켜, users에 저장하라.
		User[] users = userService.setUsersArray();
		
		//userService에있는 매개변수(users)를 포함한 insertUser를 실행하라
		userService.insertUser(users);
		////userService에있는 매개변수(users)를 포함한 showUsersInfo를 실행하라
		userService.showUsersInfo(users);
	}

}
