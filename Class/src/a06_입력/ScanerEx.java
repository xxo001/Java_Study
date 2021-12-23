package a06_입력;

import java.util.Scanner;

public class ScanerEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next(); 
		//in.next() 문자열을 입력 받는 기능 -> 콘솔창에 입력
		System.out.println("사용자의 이름은" + name+ "입니다.");
		int year = in.nextInt();
		//in.nextInt() 숫자를 입력 받는 기능 -> 콘솔창에 입력
		System.out.println("입력하신 년도는"+ year + "입니다.");
		/*Scanner 는 클래스. 사용하기전에 선언을 해주어야한다 
		 * 1) 컨트롤 쉬프트 o 를누르면 필요한 모든 클래스를 자동 선언
		 * 2) 스캐너위에 마우스를 올려 import 선택
		 * 3) 스캐너에서 쉬프트 엔터 import 선택
		 * 
		 * String과 같이 Scanner 변수명 = 의 형태
		 * System=운영체제. out=출력. in=입력. 
		 * 즉, in명령어는 콘솔창에 입력을 받는것.
		 */

	}

}
