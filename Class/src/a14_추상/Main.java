package a14_추상;

public class Main {

	public static void main(String[] args) {
		//미완성 상태인 Animal은 생성불가 , override를 통해 완성된 Human만 생성 가능
		Human h = new Human();
		//업캐스팅은 가능
		Animal a = new Human();
		
		//추상 메소드를 통해 설계도를 만들 수 있음
		Animal[] animals = new Animal[10];
		animals[0] = new Human();
		animals[1] = new Tiger();

	}

}
