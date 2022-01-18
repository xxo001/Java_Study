package a16_인터페이스2;

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	//컨스트럭터를 해준후에는 기본생성자 꼭 생성
	public User() {
		// TODO Auto-generated constructor stub
	}
	//컨스트럭터
	public User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//toString 
	//override는 상속이나 구현이 되어야 가능 하지만,
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	

	
	
}
