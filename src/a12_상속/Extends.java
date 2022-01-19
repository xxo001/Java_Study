package a12_상속;
/**
 * 
 * 상속
 * 부모, 자식
 * 부모(100억, 차3대, 아파트3개) --> 자식
 * 
 * 
 * 자식이 존재하려면 부모가 먼저 존재해야함
 * 
 * @ 는 어노테이션 --> 무언가를 설정해주거나, 기능을 대신해주는것
 * Override 어노테이션 = 재정의 의미
 *
 */
//Human의 상위군인 Animal에 상속
//super --> 부모클래스의 것을 의미 (this와 상반된 의미)
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



public class Extends {

	public static void main(String[] args) {
		Animal a = new Animal();
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		//부모클래스는 자식의 것을 사용할 수 없음. move만 가능
		a.move();
		h.move();
		h.readBook();
		t.move();
		t.hunting();
		e.flying();
		e.move();
		
		/**
		 *  <부모가 자식의 것을 사용할 수 없는 이유>
		 *  업캐스팅, 다운캐스팅의 개념
		 *  
		 *  double d = 10; --> 정수 10이지만 실수자로형으로 바뀜
		 *  int i = (int)10.1;
		 *  
		 *  Animal human = new Human(); --> Human(자식)이지만, Animal(부모)로 바뀌어 생성저장 --> 자식의 것 사용 불가
		 *  Human humanA = (Human)human; --> Human(자식) 으로 형변환 가능
		 *  Tiger tigerA = (Tiger)human; --> Tiger(자식) 이지만, Tiger는 생성하지 않았기에, 변환 불가
		 *  
		 *  Animal animal = new Animal(); --> Animal(부모)만을 생성
		 *	Human humanA2 = (Human)animal; --> Animal(부모)를 Human(자식)으로 형변환 불가 
		 *
		 *	
		 */
			
	}

}

