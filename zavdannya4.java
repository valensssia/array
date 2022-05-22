package array;

import java.util.Scanner;

public class zavdannya4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int sum = 0;
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[0] < a[i]) {
				b = a[i];
				sum += 1;
			}
		}
		System.out.println(sum);
			
		}
	
}