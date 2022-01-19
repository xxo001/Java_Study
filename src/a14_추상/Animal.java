package a14_추상;

public abstract class Animal {
	//move메소드는 어차피 자식 클래스에서 override하여 사용 때문에, 추상메소드로 생성 --> 미완성상태
	//메소드가 미완성상태기 때문에, 클래스도 미완성 상태
	public abstract void move();
	public abstract void jump();
}

	//미완성 클래스를 상속 받았기 때문에, 자식클래스도 미완성 상태
	//override를 통해 완성시켜주는 과정
class Human extends Animal {
	@Override
	public void move() {
	}
	@Override
	public void jump() {	
	}
}

class Tiger extends Animal{
	@Override
	public void jump() {
	
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
