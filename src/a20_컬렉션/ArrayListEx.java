package a20_컬렉션;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("안녕");
		arrayList.add("하세");
		arrayList.add("요.");
		//ArrayList안에는 toString이 자동으로 오버로딩 되어있음
		//원래 배열은 for문으로 조회
		System.out.println(arrayList);
		
		//값을 하나씩 조회
		System.out.println("0번인덱스 값 :" + arrayList.get(0));
		System.out.println("1번인덱스 값 :" + arrayList.get(1));
		System.out.println("2번인덱스 값 :" + arrayList.get(2));
		
		//리스트의 크기 조회
		//원래 배열에서는 .length로 조회
		System.out.println(arrayList.size());
		
		//for문을 활용한 List자료 조회
		for(int i = 0 ; i < arrayList.size(); i++) {
			System.out.println(i + "번째 인덱스 값 : " + arrayList.get(i));
		}
		
		//foreach를 활용한 List자료 조회
		for(String str : arrayList) {
			System.out.println(str);
		}
		
		//remove를 활용한 삭제
		//remove()메소드는 삭제한후, 그삭제한 값을 return하기에, 바로출력 까지 가능
		System.out.println(arrayList.remove(1));
		
		//삭제후 List 출력
		//지워진 부분을 채워줌 --> 자동정렬
		System.out.println(arrayList);
		
		//위의 리스트를 원래 배열의 방식으로 생성
		String[] array1 = {"안녕" ,"하세","요."};
		array1[1] = null;
		for(int i = 0 ; i<array1.length; i++) {
			if(array1[i] == null && (i+1) != array1.length) {
				array1[i] = array1[i+1];
				array1[i+1] = null;
			}
		}
		int count = 0;
		for(String str : array1) {
			if(str != null) {
				count++;
			}
		}
		String[] array2 = new String[count];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[1];
			System.out.println(array2[i]);
		}

	

	}

}
