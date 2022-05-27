package array;

import java.util.Scanner;

public class zavdannya8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] a = new int[x];
		for(int i = 0; i < x; ++i) {
			a[i] = sc.nextInt();
			if (i % 2 == 0 && i + 1 < x) {
				System.out.print(a[i + 1]);
				
			}else if(i % 2 != 0) {
				System.out.print(a[i - 1]);
			}else {
				System.out.print(a[i]);
			}
			}for(int i = 0; i < x; ++i) {
				System.out.print(a[i] + " ");
			}
		}
			
		}