package array;

import java.util.Scanner;

public class zavdannya7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
			
		}
	
}
}