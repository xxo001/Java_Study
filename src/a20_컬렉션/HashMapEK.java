package a20_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEK {

	public static void main(String[] args) {
		//Map은 key 와 value두개의 제네릭
		//set과 마찬가지로 HashMap을 바로 Map으로 업캐스팅 하며 생성
		Map<String, String> category = new HashMap<String, String>();
		
		category.put("tumbler", "텀블러");
		category.put("mugcup", "머그컵");
		category.put("plate", "접시");
		category.put("spoon&chopsticks", "수저");
		category.put("pot", "냄비");
		
		String input = "mugcup";
		
		//<if input == tumbler --> 텀블러 출력 하는 명령>
		//map을 사용하지 않는다면
		if(input.equals("tumbler")) {
			System.out.println("텀블러");
		}
		else if(input.equals("mugcup")) {
			System.out.println("머그컵");
		}
		else if(input.equals("plate")) {
			System.out.println("접시");
		}
		else if(input.equals("spoon&chopsticks")) {
			System.out.println("수저");
		}
		else if(input.equals("pot")) {
			System.out.println("냄비");
		}
		else {
			System.out.println("null");
		}
		
		//**map을 사용 한다면**
		String koStr = category.get(input);
		if(koStr.equals(null)) {
			System.out.println("지원하지 않는 값입니다.");
		}
		else {
			System.out.println(koStr);
		}
		
		//<컴퍼니 와 펄스널을 이용 하는 코드>
		PersonalUser personalUser = new PersonalUser();
		personalUser.setUsername("p_jaehyeon");
		personalUser.setPassword("1234");
		personalUser.setPersonal_name("김재현");
		
		CompanyUser companyUser = new CompanyUser();
		companyUser.setUsername("c_jaehyeon");
		companyUser.setPassword("4321");
		companyUser.setCompany_name("(주)재현회사");
		
		//같은key가 중복될때는, 나중에 put한 데이터가 덮어씀
		CompanyUser companyUser2 = new CompanyUser();
		companyUser2.setUsername("c_jaehyeon");
		companyUser2.setPassword("1234");
		companyUser2.setCompany_name("(주)현재회사");
		
		//아이디 비밀번호 입력 --> 로그인 시도
		String username = "p_jaehyeon";
		String password = "1234";
		
		Map<String, User> userMap = new HashMap<String, User>();
		//User를 상속 받고있기에, 제네릭에 personalUser companyUser 둘다 가능
		userMap.put(personalUser.getUsername(), personalUser);
		userMap.put(companyUser.getUsername(), companyUser);
		userMap.put(companyUser2.getUsername(), companyUser2);

		
		//personal과 company가 User로 업캐스팅 후 들어감
		//--> userMap에 있는 <username> key의  value를 가져와서 user에 담음
		User user = userMap.get(username);
		if(user != null && user.getPassword().equals(password)){
			if(user instanceof PersonalUser) {
				//다운캐스팅 후 toString
				System.out.println((PersonalUser)user);
			}
			else {
				System.out.println((CompanyUser)user);
				
			}
		}else {
			System.out.println("존재하지 않는 계정이거나 비밀번호가 다릅니다.");
		}
		
		//<key값을 통해 get을 해야하는데 key값을 모를때>
		//keySet : key를 Set형태로 바꾸었음
		System.out.println(userMap.keySet()); //-->key값 조회
		//set으로 바뀐 key값들을 iterator를통해 바꾸고 출력 
		Set<String> set = userMap.keySet(); //-->key값을 하나씩 들고올땐 iterator사용
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
