package a20_컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		//hashset, treeset... 등을 set으로 한번에 묶어서 사용 --> 생성부터 업캐스팅
		Set<String> set = new HashSet<String>() ;
		
		//컬렉션의 자식이기때문에, 컬렉션의 메소드 add사용 가능
		set.add("김");
		set.add("재");
		set.add("현");
		//set은 중복이 불가. 조회되지 않음  --> 중복데이터는 덮어쓰기가 됨
		set.add("현");
		//set은 순서가 없기때문에, 정렬되어 나오지 않음
		System.out.println(set);
		
		
		//**set에서는add를 못쓰기에, 값을 가져오는 방법**
		//iterator의 형태로 return을 받기에, iterator()를 생성해주어야함
		//--> iterator의 형으로 받은 정렬데이터를 iterator에 담음
		Iterator<String> iterator = set.iterator();
		//다음값이 있는지 물어보는 while --> BOF는 시작지점, EOF는 값이없기에 EOF 앞에서 종료
		while(iterator.hasNext()) {
			/*<원하는 값을 가져와야 할때는> --> 원하는 값과 iterator에서 가져온 값이 같을때만 출력
			while(iterator.hasNext()){
			String str = iterator.next();
			if(str.equals("김")) {
				System.out.println(str);
				}
			}
			*/
			//BOF에서 시작하여, 다음 칸으로 넘기는 명령 iterator.next() --> BOF시작이기에, 첫값도 가져올 수 있음
			System.out.println(iterator.next());
		}
		
		//**remove사용** 
		//remove의 return값은 boolean형태
		set.remove("재");
		System.out.println(set);
		
		
		

	}

}
