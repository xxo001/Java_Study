package a08_반복문;

public class SumWhile {

	public static void main(String[] args) {
		//while(종결조건){명령문}
		//종결조건을 만족하면 명령문 실행 > 반복
		//1~100더하기
		int i = 0 ;
		int result = 0 ;
		
		while(i < 100) {
			System.out.println("i값은" + i);
			result += (i+1);
			i++;
		}
		System.out.println("결과 :" + result);

	}

}
