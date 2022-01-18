package a08_반복문;

public class Foreach {

	public static void main(String[] args) {
		//생성과 동시에 값을 대입
		String[] strArray = {"김재현", "김재현", "김재현", "김재현"};
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		/*
		 * <일반 for 문>
		for(int i = 0 ; i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		for(int i = 0 ; i<strArray.length;i++) {
			System.out.println(numArray[i]);
		}
		*/
		
		
		// <foreach 문> --> 더욱 간략
		for(String str : strArray) {
			System.out.print(str);
		}
		System.out.println();
		for(int num : numArray) {
			System.out.print(num);
		}
	}

}
