package a02_변수;

public class Conversion {
	public static void main(String[] args) {
		//int num = 10; //업캐스팅
		//double number = num; 
		//int age = (int)number; //다운캐스팅(형변환타입)
		//System.out.print(age);
		
		//업캐스팅
		//1. 문자 -> 정수
		char c = 'A';
		int i_c = c;
		System.out.println(i_c);
		
		int i = 10000000;
		char c_i = (char)i;
		System.out.println(c_i); 
		//65,535 이상의 값이기에 뒷 숫자들이 짤림>데이터손실
		
		//2. 정수 -> 실수
		double i_d = i;
		System.out.println(i_d);
		
		double d = 3.14;
		int d_i = (int)d ;
		System.out.println(d_i);
		
		
	}

}
