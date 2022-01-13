package a16_인터페이스2;

import java.util.Scanner;

public class KakaoUserServiceImpl implements UserService {
	private Scanner scanner ;
	private UserData userData;
	private User[] users;
	
	//생성자가 선언되어야 scanner사용하도록 선언
	public KakaoUserServiceImpl() {
		scanner = new Scanner(System.in);
		userData = new UserData();
		userData.insertUsers();
		userData.getUserDataBase();
	}
	
	//UserService의 메소드들을 override
	@Override
	//배열에 있는 이름과 내가 입력한 이름이 같을때 user를 return, 같지않을때는 null을 return
	public User getUser() {
		String username = null;
		System.out.println("[Kakao 사용자 검색]");userData.getUserDataBase();
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public boolean addUser() {
		return false;
	}
	
	@Override
	public boolean removeUser() {
		return false;
	}
	

	
}
