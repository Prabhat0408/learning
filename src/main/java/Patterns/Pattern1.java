package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern3(5);

	}
	
	
	public static void  pattern1(int n) {
		for(int i =0;i<=n;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	/*******
	
	*****
	
	****
	
	***
	
	**
	
	**/

	
	
	public static void  pattern2(int n) {
		for(int i =n;i>=0;i--) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	//pattern 2 alternate
	public static void  pattern2_1(int n) {
		for(int i =0;i<=n;i++) {
			for(int j =n-i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
/*    *

   **

  ***

 ****

******/

	
	public static void  pattern3(int n) {
		for(int i =0;i<n;i++) {
			for(int j =n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k =0; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
