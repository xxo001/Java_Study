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
	
	public  Teacher addTeacher() {
		Teacher teacher = new Teacher();
		System.out.println("선생님 정보를 입력해 주세요");
		System.out.print("이름 : ");
		teacher.setName(scanner.next());
		scanner.nextLine();
		System.out.print("과목 : ");
		teacher.setSubject(scanner.nextLine());
		System.out.print("담당학년 : ");
		teacher.setClassYear(scanner.nextInt());
		scanner.nextLine();
		System.out.print("담당반 : ");
		teacher.setClassGroup(scanner.nextInt());
		scanner.nextLine();
		
		return teacher;
		
	}
	
	public Student addStudent () {
		Student student = new Student();
		System.out.println("학생 정보를 입력해 주세요");
		System.out.print("이름 : ");
		student.setName(scanner.next());
		System.out.print("학년 : ");
		student.setStudentYear(scanner.nextInt());
		scanner.nextLine();
		System.out.print("반 : ");
		student.setStudentGroup(scanner.nextInt());
		scanner.nextLine();
		System.out.print("번호 : ");
		student.setStudentNumber(scanner.nextInt());
		scanner.nextLine();
		
		return student;
		
		
	}
	
	public void insertPerson(Person[] persons) {
		/*
		 *  1. 학생등록
		 *  2. 선생님등록
		 *  if 1이면 학생등록
		 *  if 2면 선생님 등록
		 */
		for(int i = 0 ; i<persons.length;i++) {
			System.out.print("학생등록(1) / 선생님등록(2) : ");
			int num = scanner.nextInt();
			
			if(num == 1) {
				persons[i] = addStudent();
			}
			else {
				persons[i] = addTeacher();
			}
			
		}
		System.out.println("학생/선생님의 정보 입력 완료");
	}
	
	public void showInfoPerson(Person[] persons) {
		for(int i=0;i<persons.length;i++) {
			
			persons[i].showInfo();
		}
		
	}
}
