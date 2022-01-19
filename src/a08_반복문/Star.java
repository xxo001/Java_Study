package a08_반복문;

public class Star {

		//반복문의 기본이 되기에, 꼭 복습할 것
		   public static void main(String[] args) {
		      //별찍기
		      for(int i = 0 ; i < 5 ; i++) {
		         for(int j = 0 ; j < i+1 ; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      System.out.println();
		      //반대로 별찍기
		      for(int a = 0 ; a < 5 ; a++) {
		         for(int b = 0; b < 5-a ; b++){
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      System.out.println();
		      //오른편에 별찍기
		      for(int i = 0 ; i < 5; i++) {
		         for(int j = 0; j < 4 - i; j++) {
		            System.out.print(" ");
		         }
		         for(int j = 0 ; j < i+1 ; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      System.out.println();
		      
		      //오른편에 반대로 별찍기
		      for(int i = 0 ; i < 5 ; i++) {
		         for(int j = 0 ; j < i ; j++) {
		            System.out.print(" ");
		         }
		         for(int j = 0 ; j < 5 - i ; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		         

		   }

		}