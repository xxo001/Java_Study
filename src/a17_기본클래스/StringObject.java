package a17_기본클래스;

import java.util.Scanner;

public class StringObject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String name1 = "김재현";
		String name2 = "김재현";
		System.out.print("이름입력 : ");
		String name3 = scanner.nextLine();
		// String name4 = new String("김재현"); 이 원래는 생략 되어있는 것임 --> String도 클래스 이기때문
		String name4 = new String("김재현");

		
		/*
		*이 경우는 true로 출력 --> name1 과 name2의 리터럴의 주소가 같기때문
		System.out.println("name1 , name2 : " + (name1 == name2));
		이 경우는 faㅣse로 출력 --> next안에있는 new String으로 인해 새로운 주소에 리터럴이 생기기 때문
		System.out.println("name1 , name3 : " + (name1 == name3));
		이 경우도 false로 출력 --> new로 인하여 새로 생긴 주소 안에 "김재현"이라는 리터럴이 생기기 때문
		System.out.println("name1 , name3 : " + (name1 == name4));
		 */
		
		//따라서 .equals 사용
		System.out.println("name1 , name2 : " + (name1 == name2));
		System.out.println("name1 , name3 : " + (name1 == name3));
		//hashcode로 인하여 true로 출력됌
		System.out.println("name1 , name3 : " + (name1.equals(name4)));

	

	}

}
