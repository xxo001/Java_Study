package a07_조건문;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * 해당 값을 만족한 case부터 모두실행 >> break를 통해 원하는 곳에서 빠져나감
		 * case에 만족한 값이 없다면,  default 구문이 실행
		 */
		
		char select = 'B';
		
		switch(select) {
			case 'A':
				System.out.println("B");
			case 'B':
				System.out.println("B");
			case 'C':
				System.out.println("B");
			case 'D':
				System.out.println("B");
				break;
			case 'F':
				System.out.println("B");
				break;
			default:
				System.out.println("잘못된 성적");
		}

	}

}
