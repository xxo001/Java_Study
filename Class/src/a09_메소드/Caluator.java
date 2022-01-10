package a09_메소드;

import java.util.Scanner;

public class Caluator {
	public static void add(double num1, double num2) {
		System.out.println("두 수의 합은 :" + (num1+num2));
		
	}
	public static void sub(double num1, double num2) {
		System.out.println("두 수의 차은 :" + (num1 - num2));
	}
	public static void mul(double num1, double num2) {
		System.out.println("두 수의 곱은 :" + (num1*num2));
		
	}
	//1)몫이 소숫점으로 나오게 하기 위해서, 입력부터 실수로 받음
	public static void div(double num1, double num2) {
		//0으로 나눗셈은 불가하기에 조건
		if(num2 == 0 || num1 == 0) {
			System.out.println("0에서 나누거나 0으로 나눈 것은 불가합니다.");
		}
		//2)몫이 소숫점으로 나오게 하기 위해서, num1num2를 실수로 형변환
		else {
			System.out.println("두 수의 몫은 :" + ((double)num1/(double)num2));
		}
		
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("계산 방법을 선택해 주세요 :");
			int cmd = in.nextInt();
			in.nextLine();
			//double로 바꿔줌 >> 소수점을 위해
			double num1, num2;
			
			System.out.println("두 수를 입력해 주세요.");
			System.out.print("첫번째 수 :");
			num1 = in.nextDouble();
			
			System.out.print("두번째 수 :");
			num2 = in.nextDouble();
			in.nextLine();
			
			in.close();
			
			if(cmd == 1) {
				add(num1, num2);				
			}
			else if(cmd == 2) {
				sub(num1, num2);
			}
			else if(cmd == 3) {
				mul(num1, num2);
			}
			else if(cmd == 4) {
				div(num1, num2);
			}
			else if(cmd == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못된 선택입니다.");
			}
		}

	}

}
