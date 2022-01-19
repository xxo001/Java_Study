package a08_반복문;

public class DoubleLoop {

	public static void main(String[] args) {
		/* 중첩 반복문
		 * 1. while
		 * 반복 때 마다 j = 0 으로 초기화
		 * 반복문을 custom 해서 사용하기 용이
		 */
		
		int i = 0 ;
		while(i < 5) {
			System.out.println("[i값]:" + i);
			int j = 0 ;
			while(j < 3) {
				System.out.println("j값" + j);
				j++;
			}
			i++;
		}
		/*
		 * 2. for
		 * a++ 와 같이 규칙적인 반복에는 for문이 더 간단 명료
		 * 반복의 갯수가 정해져 있을대 주로사용
		 */
		
		for(int a=0;0<5;a++) {
			System.out.println("[a값:]" + a);
			for(int b= 0;b<3;b++) {
				System.out.println("b값" + b);
			}
		}
	}

}
