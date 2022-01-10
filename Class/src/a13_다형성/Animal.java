package a13_다형성;

class Human extends Animal{
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	@Override
	public void move() {
		System.out.println("사람이 두발로 걸어 다닙니다.");
	}
}

class Tiger extends Animal{
	public void hunting() {
	System.out.println("호랑이가 사냥을 합니다");
}
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걸어 다닙니다.");
	}
}

class Eagle extends Animal{
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아다닙니다.");
	}
	@Override
	public void move() {
		System.out.println("독수리가 날아 다닙니다.");
	}
}


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


