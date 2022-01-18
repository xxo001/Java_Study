package a18_lombok;

public class Main {

	public static void main(String[] args) {
		//AllConstructor사용가능
		User user = new User("김재현", "1234", "김재현", "gsr0920@naver.com");
		User user2 = new User("김재현", "1234", "김재현", "gsr0920@naver.com");
		
		//builder 는 순서에 맞지않게 값을 넣어도, 생성 가능
		//builder() 까지가 기본생성 --> 그뒤는 setter가 실행
		//기본생성자와 setter가 합쳐진 형태
		Student s = Student.builder().name("김재현").grade(3).cla(3).build();
		System.out.println(s);
				
		//toString사용가능
		System.out.println(user);
		System.out.println(user2);
				
		System.out.println(user.equals(user2));
	}

}
