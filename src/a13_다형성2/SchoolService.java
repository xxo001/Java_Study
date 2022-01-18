package a13_다형성2;

import java.util.Scanner;

/*
 * service 로직처리 --> 기능
 * 
 * 
 */

public class SchoolService {
	private Scanner scanner;
	
	//SchoollService()가 생성될때 스캐너 사용 되도록 선언
	public SchoolService() {
		scanner = new Scanner(System.in);
	}
	
	public Person[] setPersonArray() {
		// 사람 배열의 크기를 지정
		System.out.print("몇 명의 사람을 지정 하시겠습니까 ? : ");
		int index = scanner.nextInt();
		scanner.nextLine();
		return new Person[index];
	}
	
	public  Teacher addTeacher() {
		Teacher teacher = new Teacher();
		System.out.println("[선생님 정보 입력]");
		System.out.print("이름 : ");
		teacher.setName(scanner.nextLine());
		System.out.print("과목 : ");
		teacher.setSubject(scanner.nextLine());
		System.out.print("담당학년 : ");
		teacher.setClassYear(scanner.nextInt());
		System.out.print("담당반 : ");
		teacher.setClassGroup(scanner.nextInt());
		scanner.nextLine();
		
		return teacher;
		
	}
	
	public Student addStudent () {
		Student student = new Student();
		System.out.println("[학생 정보 입력]");
		System.out.print("이름 : ");
		student.setName(scanner.nextLine());
		System.out.print("학년 : ");
		student.setStudentYear(scanner.nextInt());
		System.out.print("반 : ");
		student.setStudentGroup(scanner.nextInt());
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
			while(true) {
				System.out.println ("[총"+ persons.length + "명 중 " + (i+1) + "번째 입력]");
				System.out.print("학생등록(1) / 선생님등록(2) : ");
				int select = scanner.nextInt();
				scanner.nextLine();
				
				if(select == 1) {
					//업캐스팅
					persons[i] = addStudent();
					break;
				}
				else if (select == 2){
					persons[i] = addTeacher();
					break;
				}
				else {
					System.out.println("잘못된 명령입니다.");
				}
			}
		}
		System.out.println("학생/선생님의 정보 입력 완료");
		System.out.println("");
	}
	
	public void showInfoPerson(Person[] persons) {
		//<for문>
		for(int i=0;i<persons.length;i++) {
			persons[i].showInfo();
			if(persons[i] instanceof Student) {
				Student s = (Student)persons[i];
				s.study();
			}
			else if(persons[i] instanceof Teacher){
				Teacher t = (Teacher)persons[i];
				t.studyClass();
			}
		}
	}
}
		/*
		 * <foreach 문>
		for(Person person : persons) {
			person.showInfo();
			if(person instanceof Student) {
				Student s = (Student)person;
				s.study();
			}
			else if(person instanceof Teacher){
				Teacher t = (Teacher)person;
				t.studyClass();
			}
		}
		*/
		

