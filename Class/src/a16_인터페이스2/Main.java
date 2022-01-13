package a16_인터페이스2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = null; 
		
		while(true) {
			System.out.println("[서비스 선택]");
			System.out.println("1. Naver");
			System.out.println("2. Kakao");
			int select = scanner.nextInt();
			scanner.nextLine();
			
			//업캐스팅
			if(select == 1) {
				userService = new NaverUserServiceImpl();
				break;
			}
			else if(select == 2) {
				userService = new KakaoUserServiceImpl();
				break;
			}
			else {
				System.out.println("지원하지 않는 서비스 입니다.");
			}
			System.out.println();
		}

		//업캐스팅한 후 기능이 같은 getUser를 사용 --> 업캐스팅으로 인터페이스를 같이만들어주었기 때문
		User user = userService.getUser();
		if(user == null) {
			System.out.println("입력하신 계정의 사용자를 찾을 수 없습니다.");
		}
		else {
			System.out.println(userService.toString());
		}

	}

}
