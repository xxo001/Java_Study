package a03_상수;

public class Constant {
	public static void main(String[] args) {
		//상수 표현 법
		int maxNumber = 100;  //변수선언
		final int MAX_NUMBER ; 
		//상수선언(final과 함께 변수명을 모두 대문자)
		
		maxNumber = 100 ;
		MAX_NUMBER = 200 ; 	
		//위에서 초기화 하지 않았기에 여기서 초기화
		
		System.out.print("변수:");
		System.out.println(maxNumber);
		System.out.print("상수:");
		System.out.println(MAX_NUMBER);
		
		//변수와 상수를 다르게 표현하는 법
		maxNumber = 200 ; //변수는 다른 값을 대입
		System.out.print("변수:");
		System.out.println(maxNumber);
		System.out.print("상수:");
		System.out.println(MAX_NUMBER-100); //상수는 기준값에서 연산

		//증감연산자 
		//(++i 선증가 i++ 후증가 )
		int i = 1;
		System.out.println("1: ->" + i++);
		System.out.println("2: ->" + i);
		
		
	}

}
