package a13_다형성2;

/* 학생
 * studentYear 학년
 * studentGroup 반
 * studentNumber 번호
 * 
 */
public class Student extends Person{
	private String name ;
	private int studentYear ;
	private int studentGroup ;
	private int studentNumber ;
	
	


	public int getStudentYear() {
		return studentYear;
	}




	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}




	public int getStudentGroup() {
		return studentGroup;
	}




	public void setStudentGroup(int studentGroup) {
		this.studentGroup = studentGroup;
	}




	public int getStudentNumber() {
		return studentNumber;
	}




	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}




	public void study() {
		// 000학생이 공부를 합니다.
		super.setName(name);
		System.out.println( name + " 학생이 공부를 합니다");
	}
	
	//사람의 showInfo 메소드 오버라이딩 후 학생정보 출력

}
