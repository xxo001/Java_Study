package a10_클래스2;
//User의 동작,기능 정의 Class
import java.util.Scanner;

public class UserService {
	//scanner 변수를 private를 선언
	private Scanner scanner;
	
	//클래스 내부에서 Ctrl + space 하면 생성자 자동완성
	//UserService가 생성되어야 Scanner 실행
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	//사용자 추가 메소드
	public User addUser() {
		//주소가 없는 변수들
		//기본 대입 값이 없기때문에, null로 초기화 해주는 작업 --> 최신버전은 자동으로해주지만, 기본소양
		String username = null ;
		String password = null ;
		String name = null ;
		String email = null ;
		
		System.out.println("사용자의 정보를 입력해 주세요.");
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		/*set을 이용한 return
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		*/
		
		//생성자를 이용한return 방법
		return new User(username, password, name, email);
		
	}
	
	
	//사용자 추가 메소드
	//위의 소스코드를 줄이는 방법
	public User addUser2() {
		//기본 생성자 생성
		User user = new User();
		
		//입력받은 문자를 바로 set에다가 저장
		System.out.println("사용자의 정보를 입력해 주세요.");
		System.out.print("아이디 : ");
		user.setUsername(scanner.nextLine());
		System.out.print("비밀번호 : ");
		user.setPassword(scanner.nextLine());
		System.out.print("이름 : ");
		user.setName(scanner.nextLine());
		System.out.print("이메일 : ");
		user.setEmail(scanner.nextLine());
		

		return user;
		
		
	}
	/*
	 * quiz. 사용자가 등록되기전에 <1첫번째 사용자를 등록하시겠습니까?> 가출력
	 * y입력시 진행 n출력시 패스
	 * 로 바꾸어보기
	 */
	
	//User배열 메소드 --> 입력받은 숫자를 인덱스에 저장하여 배열의 크기를 정하는 메소드
	public User[] setUsersArray() {
		System.out.print("몇명의 사용자를 입력 하시겠습니까 ?");
		int index = scanner.nextInt();
		scanner.nextLine();
		return new User[index];
	}
	//반환값이 없고 매개변수를 받는 메소드 --> addUser를 반복하여 각 i에 정보를 입력
	public void insertUser(User[] users) {
		//건수 를 담기위한 변수 선언
		int insertCount = 0;
		
		for (int i = 0 ;i<users.length ;i++) {
			System.out.print("<"+(i+1)+ "번째 사용자를 등록 하시겠습니까?>");
			String answer = scanner.nextLine();
			
			//String을 비교할때는 == 가 아닌 .equals("")로 비교
			//equals도 클래스 --> 반환값은 boolean(True or False)로 나옴 --> True일때만 실행
			if (answer.equals("y")) {
				users[i] = addUser();
			//입력이 성공했을때만 1씩 건수를 저장
				insertCount++;
			}
			else{
				continue;
			}
			
		}
		System.out.println("사용자 입력 완료(" + insertCount + "건)");
		
	}
	//각각의 i에 입력된 users를 반복하여 showUserInfo를 통해 출력
	public void showUsersInfo(User[] users) {
		for(int i = 0 ;i<users.length;i++) {
			if (users[i] == null) {
				continue;
			}
			users[i].showUserInfo();
		}
	}

}
