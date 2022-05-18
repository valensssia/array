package array;

import java.util.Scanner;

public class zavdannya2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if ( i % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}