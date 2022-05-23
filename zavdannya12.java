package array;

import java.util.Scanner;

public class zavdannya12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();}
		int b=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
			if(i==6 && b<=a[i]){
				c=i+2;
				}else if(b>a[i]){
					b=a[i];
					c=i+1;
					break;
					}
			}
		System.out.println(c);
    }
}



            