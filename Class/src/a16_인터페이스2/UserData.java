package a16_인터페이스2;

public class UserData {
	private User[] userDataBase ;
	
	public UserData() {
		userDataBase = new User[5];
	}
	
	
	public User[] getUserDataBase() {
		return userDataBase;
	}
	public void setUserDataBase(User[] userDataBase) {
		this.userDataBase = userDataBase;
	}


	public void insertUsers() {
		userDataBase[0] = new User("aaaa", "1234", "김재현0", "gsr0920@naver.com");
		userDataBase[1] = new User("bbbb", "1234", "김재현1", "gsr0921@daum.net");
		userDataBase[2] = new User("cccc", "1234", "김재현2", "gsr0922@yahoo.com");
		userDataBase[3] = new User("dddd", "1234", "김재현3", "gsr0923@gmail.com");
		userDataBase[4] = new User("eeee", "1234", "김재현4", "gsr0924@kakao.com");
	}

}
