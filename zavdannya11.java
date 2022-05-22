package array;

import java.util.Scanner;

public class zavdannya11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int m = a[0];
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] != m) {
			s += 1;
			
		}
			m = a[i];
		}
		System.out.println(s);
			
		}
	

}