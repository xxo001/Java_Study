package a06_입력;

import java.util.Scanner;

/**
 * 사용자의 이름을 입력 해주세요 : 김준일 ->문자열
 * 사용자의 아이디를 입력해 주세요 : xxo001 ->문자열
 * 사용자의 비밀번호를 입력해 주세요 : 1234 ->정수
 * 사용자의 이메일을 입력해 주세요 : gsr0920@naver.com ->문자열
 * 
 * [입력한 사용자의 정보]
 * 이름 : 김준일
 * 아이디 : xxo001
 * 비밀번호 : 1234
 * 이메일 : gsr0920@naver.com
 * @author admin
 *
 */
public class Userinfo {
	
	public static void main(String[] args) {
	//내가한것
			Scanner in = new Scanner(System.in);
				
			System.out.print("사용자의 이름을 입력 해주세요 :");
			String name = in.next();
				
			System.out.print("사용자의 아이디를 입력 해주세요 :");
			String id = in.next();
				
			System.out.print("사용자의 비밀번호를 입력 해주세요 :");
			int password = in.nextInt();
				
			System.out.print("사용자의 이메일을 입력해 주세요.:");
			String email = in.next();
				
			System.out.println("[입력한 사용자의 정보]");
			System.out.println("이름 :" + name);
			System.out.println("아이디 :" + id);
			System.out.println("비밀번호 :"+ password);
			System.out.println("이메일 :" + email);
				


	//--------------------------------------------------------
				
	//모범답안
				/*
				 * Scanner in = new Scanner(System.in);
				
				String name;
				String id;
				int password;
				String email;
				
				System.out.print("사용자의 이름을 입력 해주세요 :");
				name = in.next();
				System.out.print("사용자의 아이디를 입력해 주세요 :");
				id = in.next();
				System.out.print("사용자의 비밀번호를 입력해 주세요 :");
				password = in.next();
				System.out.print("사용자의 이메일을 입력해 주세요 :");
				email = in.next();
				
				System.out.println("\n[입력한 사용자의 정보]\r\n"
						+ "이름:" +name+ "\r\n"
						+ "아이디:" +id+ "\r\n"
						+ "비밀번호:" +email+ "\r\n"
						+ "이메일:" +password+);
				//--------------------------------------------------------
				Scanner in = new Scanner(System.in);
				String name;
				String id;
				int password;
				String email;
				
				System.out.print("사용자의 이름을 입력 해주세요 :");
				name = in.next();
				System.out.print("사용자의 아이디를 입력해 주세요 :");
				id = in.next();
				System.out.print("사용자의 비밀번호를 입력해 주세요 :");
				password = in.next();
				System.out.print("사용자의 이메일을 입력해 주세요 :");
				email = in.next();
				
				System.out.println("\n[입력한 사용자의 정보]\r\n"
						+ "이름:" +name+ "\r\n"
						+ "아이디:" +id+ "\r\n"
						+ "비밀번호:" +email+ "\r\n"
						+ "이메일:" +password+);
				 */

	//--------------------------------------------------------
	//nextLine 과 next의 차이
	/*Scanner in = new Scanner(System.in);
				
				System.out.print("사용자의 이름을 입력 해주세요 :");
				String name = in.nextLine();
				
				System.out.print("사용자의 아이디를 입력 해주세요 :");
				String id = in.nextLine();
				
				System.out.print("사용자의 비밀번호를 입력 해주세요 :");
				int password = in.nextInt();
				in.nextLine(); //버퍼에 들어가있는 엔터를 의미없이 써줌으로써 정상작동 가능
				
				System.out.print("사용자의 이메일을 입력해 주세요.:");
				String email = in.nextLine();
				
				System.out.println("[입력한 사용자의 정보]");
				System.out.println("이름 :" + name);
				System.out.println("아이디 :" + id);
				System.out.println("비밀번호 :"+ password);
				System.out.println("이메일 :" + email);
		*/



				
		

	}

}
