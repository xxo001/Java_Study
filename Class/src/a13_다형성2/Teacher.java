package a13_다형성2;
/*
 *  선생님
 *  subject 과목
 *  classYear 담임학년
 *  classGroup 담임반
 */
public class Teacher extends Person {
	private String name;
	private String subject;
	private int classYear;
	private int classGroup;
	
	
	
	
	
	public String getSubject() {
		return subject;
	}





	public void setSubject(String subject) {
		this.subject = subject;
	}





	public int getClassYear() {
		return classYear;
	}





	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}





	public int getClassGroup() {
		return classGroup;
	}





	public void setClassGroup(int classGroup) {
		this.classGroup = classGroup;
	}





	public void studyClass() {
		// 000선생님이 수업을 합니다.
		super.setName(name);
		System.out.println(name + " 선생님이 수업을 합니다");
	}
	
	//사람의 showInfo 메소드 오버라이딩 후 선생님정보 출력

}
