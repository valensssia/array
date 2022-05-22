package array;

import java.util.Scanner;

public class zavdannya5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int s = 0;
		int b = a[1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[1] > 0 & a[i] > 0) {
				b = a[i];
				s += 1;
			}
		}
		if ( s > 0) {
			System.out.println("YES");
		}else {
			System.out.println("No");
			}
			
		}
	

}