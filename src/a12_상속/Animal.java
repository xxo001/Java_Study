package a12_상속;


public class Animal {
	//선언되는 순간 "동물"이 대입됨
	private String kind = "동물";
	
	//부모 객체이기 때문에, 자식객체만 실행시켜 주어도, 자동 실행됨
	public Animal() {
		System.out.println("부모 객체 생성");
	}
	
	public void move( ) {
		System.out.println("동물이 움직입니다.");
	}

}


