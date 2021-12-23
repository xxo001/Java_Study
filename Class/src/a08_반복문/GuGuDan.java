package a08_반복문;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		/* 2x2 ~ 9x9
		 * 스케쥴이 순서대로 진행된다는것을 인지하고, 원리를 이해할것
		 * [2단]
		 * ...
		 * ...
		 * [3단]
		 * ...
		 * ...
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("시작단수 : ");
		int starDan = input.nextInt();
		input.nextLine();
		System.out.println("끝 단수 :");
		int endDan = input.nextInt();
		input.nextLine();
		
		for(int a = starDan ; a<(endDan+1); a++) {
			System.out.println("[" + a + "단]");
			for(int b = 1;b<endDan+1; b++) {
				System.out.println(a+ " X " + b + "=" + a*b);
				
			}
			System.out.println();
		}
		

	}

}
