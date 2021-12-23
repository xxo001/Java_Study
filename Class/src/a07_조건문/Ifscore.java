package a07_조건문;

public class Ifscore {

	public static void main(String[] args) {
		/*
		 * 만약 스코어가 90이상 a
		 * 80이상b 70이상c 60이상d
		 * 나머지f
		 * 100초과 0미만 이면 계산할 수 없는 점수입니다.
		 */
		
		int score = 101 ;
		if(score > 90 || score < 0) {
			System.out.println("계산할 수 없는 점수입니다.");
		}
		else if (score > 89 ) {
			System.out.println("A등급입니다");
		}
		else if (score > 79) {
			System.out.println("B등급입니다");
		}
		else if (score > 69) {
			System.out.println("C등급입니다");
		}
		else if (score > 79) {
			System.out.println("D등급입니다");
		}
		else {
			System.out.println("F입니다");
		}
		
	

	}

}
