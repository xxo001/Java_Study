package a13_다형성;

public class Casting {

	public static void main(String[] args) {
		//모두 업캐스팅(자식 -> 부모)한 상태 --> 모두 같은 자료형이기에, 배열 가능
		// 자로형도 모두 클래스 이다. 
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		Animal[] animals = new Animal[10];
		
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = eagle;
		animals[3] = tiger;
		animals[4] = eagle;
		animals[5] = human;
		animals[6] = eagle;
		animals[7] = tiger;
		animals[8] = eagle;
		animals[9] = eagle;
		
		//instance=객체 --> animals[0]이 Human의 객체니? 라는 뜻 --> True False로 나옴
		//System.out.println(animals[0] instanceof Human );
		
		//모든 자식객체에는 move메소드가 들어있기에 한번에 move실행 가능 --> 업캐스팅을 하는 이유
		for(int i = 0;i<animals.length;i++) {
			animals[i].move();
		}
		
		//다시 다운캐스팅 할때, 번거롭지 않게 instanceof 사용 --> 다시 자식객체의 기능 사용가능
		for(int i = 0 ;i<animals.length;i++) {
			//참인경우 실행
			if(animals[i] instanceof Human) {
				Human h = (Human)animals[i];
				h.readBook();
			}
			else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}
			else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
				
			}
		}

	}

}
