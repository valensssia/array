package array;

import java.util.Scanner;

public class zavdannya3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] > 0) {
				sum += 1;
			}
		}
		System.out.println(sum);
			
		}
	}
