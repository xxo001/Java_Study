package a08_반복문;

public class Sumfor {

	public static void main(String[] args) {
		//for (시작조건;종결조건;반복후처리){명령문}
		//시작조건과 종결조건이 만족되면 명령문 실행 > 반복 후처리 > 반복
		int result = 0 ;
		for(int i = 0; i < 100 ; i++) {
			result += (i+1);
			System.out.println("값은" + i);
		}
		System.out.println("결과 :" + result);
	}

}
