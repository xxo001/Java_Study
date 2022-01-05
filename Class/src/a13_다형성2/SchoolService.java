package a13_다형성2;

import java.util.Scanner;

/*
 * service 로직처리 --> 기능
 * 
 * 
 */

public class SchoolService {
	Scanner scanner = new Scanner(System.in);
	
	public Person[] setPersonArray() {
		// 사람 배열의 크기를 지정
		System.out.print("몇 명의 사람을 지정 하시겠습니까 ?");
		int index = scanner.nextInt();
		scanner.nextLine();
		
		return new Person[index];
	}
	
	public void addTeacher() {
		Teacher teacher = new Teacher();
		System.out.println("선생님 정보를 입력해 주세요");
		System.out.print("이름 : ");
		teacher.setName(scanner.nextLine());
		System.out.print("담당과목 : ");
		teacher.setSubject(scanner.nextLine());
		System.out.println("");
		
		
	}
	
	public void addStudent () {
		
	}
	
	public void insertPerson(Person[] person) {
		/*
		 *  1. 학생등록
		 *  2. 선생님등록
		 *  if 1이면 학생등록
		 *  if 2면 선생님 등록
		 */
		
	}
	
	public void showInfoPerson(Person[] person) {
		
	}
}
