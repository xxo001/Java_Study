package a04_연산자;
/**
 * 
 * @author admin
 * 조건 연산자 (삼항 연산자)
 * 조건 ? 결과(참) : 결과(거짓)
 */
public class Operation3 {

	public static void main(String[] args) {
		int score = 81;
		
		int number = (score == 100) ? 100 : (score > 89) ? 90 : (score > 79) ? 70 : 60 ;
		System.out.println(number);
		//100점과 같으면 100, 그렇지않으면 89점보다큰지 다시 연산
		
		char grade = (score == 100) ? 'A' : (score > 89) ? 'A' : (score > 79) ?  'B' : 'F';
		System.out.println(grade);
		 
		

	}

}
