package a07_조건문;

public class IfTest {

	public static void main(String[] args) {
		/* 중괄호는 하나의 if,else안에 여러 명을 넣을때 사용
		 * 통상 하나의 명령이라도 중괄호 사용 권장
		 * else의 중괄호를 지우고 아래의 if를 위로올린 후 나머지 코드 를 들여쓰기(shift+tab) > else if의 완성
		 * 자동완성기능 > Cltr + Space bar
		 */

		int number = 8;
		
		//갈림길의 시작 >> 넘버가 10일때 가는길
		if(number == 10) {
			System.out.println("number 가 10입니다");
		}
		//넘버가 10이 아닐때 가는길
		else if(number == 9) {
			System.out.println("number 가 9입니다");
		}
		else if(number == 8) {
			System.out.println("number 가 8입니다");
		}
		else {
			System.out.println("number 가 10 9 8 모두 아닙니다");
		}
	}

}
