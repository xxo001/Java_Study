package a13_다형성2;

import a10_클래스2.UserService;

public class School {
	public static void main(String[] args) {
		//service 생성 후 배열 설정
		SchoolService schoolservice = new SchoolService();
		Person[] persons = schoolservice.setPersonArray();

		//모든 배열에 학생 및 선생님 정보 등록
		schoolservice.insertPerson(persons);
		
		//모든 배열의 학생 및 선생님 정보 출력
		//학생이면 학생정보, study()
		//선생님이면 선생님정보, studyClass()
		schoolservice.showInfoPerson(persons);
		

		
		/* <질문할 내용>
	     * addTeacher와 addStudent는 업캐스팅 하지않고 생성자를 선언하는데, 배열에 담을 수 있는가 ?
	     * GitHub 히스토리 삭제하는 법
	     */

		}
	}


