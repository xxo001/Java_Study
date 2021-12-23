package a06_입력;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int kr;
		int eng;
		int math;
		double avg;
		int total;
		char grade;
			
		
		System.out.print("학생의 이름을 입력해 주세요 : ");
		name = in.nextLine();
		System.out.print("학생의 국어 성적을 입력해 주세요 :");
		kr = in.nextInt();
		in.nextLine(); //허공에 버퍼에있는 엔터를 날려주어야함
		System.out.print("학생의 영어 성적을 입력해 주세요 :");
		eng = in.nextInt();
		System.out.print("학생의 수학 성적을 입력해 주세요 :");
		math = in.nextInt();
		
		//avg = 평균
		//total = 총점
		//grade = 삼항연산자. 
		//avg 90 이상 A , 80->b 70->C 60->d 나머지 F
		/*
		 * [학생성적정보]
		 *국어 : 
		 *영어 :
		 *수학 :
		 *평균 :
		 *토탈 :
		 *등급 :
		 */
		
		avg = (kr + eng + math) / 3.0; 
		//int에서 int를 나누었기에 몫의 자료형도 int이다.
		//따라서 avg에 double로 실수 선언은 해주었지만 정수가 들어간다.
		//3.0을 나누어 주게되면 소수점까지 avg에 대입됨
		total = kr + eng + math;
		grade = avg > 89 ? 'A' : avg > 79 ? 'B' : avg > 69 ? 'C' : avg > 59 ? 'D' : 'F';
		System.out.println();
		System.out.print("[학생성적정보]\r\n"
				+"국어 :" + kr +"\r\n"
				+"영어 :" + eng +"\r\n"
				+"수학 :" + math +"\r\n"
				+"평균 :" + avg +"\r\n"
				+"토탈 :" + total +"\r\n"
				+"등급 :" + grade);
		
		
		
		
	}

}
