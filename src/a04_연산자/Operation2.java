package a04_연산자;
/** 클래스 설명
 *  *author = 글쓴이
 * @author admin
 * 논리연산자
 * AND : 곱 (&&) ex. true && true = true / true && false = false
 * OR : 합 (||) ex. true || true = true / true || false = true
 * NOT : 반전,부정 (!) ex. !true = false / !(true || false) = false
 *  */
public class Operation2 {
	/** 메소드의 설명
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//한줄 주석
		/*
		 * 여러줄 주석
		 */

		boolean trueFalse = (5>3) && (3<1);
		System.out.println(!trueFalse);
	}

}
