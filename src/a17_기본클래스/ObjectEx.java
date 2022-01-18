package a17_기본클래스;

import java.util.Objects;

//extends Object가 생략된 상태
public class ObjectEx {
	private String username;
	private String password;

	
	
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
	
	
	//부모클래스의 toString사용
	//어떤 변수를 가지고 있는지 보여줄때 사용 --> Generate toString을 이용해 한번에 생성 가능.
	@Override
	public String toString() {
		return "ObjectEx [username=" + username + ", password=" + password + "]";
	}
	
	/*
	부모클래스의 equals사용
	주소를 비교할때 사용
	@Override
		public boolean equals(Object obj) {
		//주소비교가 아니도록 수정 --> obj(ObjectEx2)는 Object로 업캐스팅 된것임 --> 따라서 ObjectEx의 get set사용 불가
		//따라서 다운캐스팅을 먼저 시켜주고 .getUsername()을 사용
			ObjectEx objectEx = (ObjectEx)obj;
			if(this.username.equals(objectEx.getUsername()));{
				return true;
			}
			else {
				return false;
			}
	*/	
			
	 
	
	
	//일일이 다운캐스팅 해주어 비교하기에 번거롭기에, 해쉬코드를 이용
	//Generate를 통해 생성 --> equals와 같이 생성됨
	@Override
	public int hashCode() {
		//username의 문자열이 hash값(고유한 값)으로 바뀌어짐
		return Objects.hash(username);
	}
	@Override
		//외부의 usernmae(obj) 와 내부의 username이 같은지 비교
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectEx other = (ObjectEx) obj;
		return Objects.equals(username, other.username);
	}
	

			
		}


