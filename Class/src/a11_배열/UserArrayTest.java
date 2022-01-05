package a11_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		//User주소값를 담을 수 있는 배열공간 5개를 생성 --> users
		User[] users = new User[5];
		
		//새로운 user객체를 생성
		User user = new User("xxo001", "1234", "김재현", "gsr0920@naver.com");
		User user2 = new User("xxo001", "1234", "김재연", "gsr0920@naver.com");
		
		//users공간의 0번째 index에다가 user를 넣음
		users[0] = user;
		users[4] = user2;
		
		//반복문으로 다른 인덱스에도 user를 넣고, showInfo 실행
		//continue를 통해 다음 인덱스에 객체가 없을때에(null), 넘어가서 실행하도록 함
		for (int i=0 ; i<users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			users[i].showUserInfo();
		}
	}

}
