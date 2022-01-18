package a17_기본클래스;

public class Main {

	public static void main(String[] args) {
		ObjectEx objectEx = new ObjectEx();
		ObjectEx objectEx2 = new ObjectEx();
		//이 경우는 주소값을 그대로 넘겨주기에, true로 출력
		ObjectEx objectEx3 = objectEx;
		//입력만 해주어도 toString으로 바로 볼수 있음
		objectEx.setUsername("재현");
		objectEx.setPassword("1234");
		objectEx2.setUsername("재현");
		objectEx2.setPassword("1234");
		
		//뒤에 .toString을 생략해도 java는 그 기능을 해줌
		System.out.println(objectEx);
		//아이디는 같지만 주소가 다르기때문에, false로 출력됨
		System.out.println(objectEx == objectEx2);
		//equals를 사용해도 주소비교이기에, false로 출력됨 --> 따라서 override에서 수정이 필요
		System.out.println(objectEx.equals(objectEx2));
	

	}

}
