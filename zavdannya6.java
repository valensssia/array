package array;

import java.util.Scanner;

public class zavdannya6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int [] a = new int[n];
		for(int i = 1; i < n-1; i++){
			a[i] = sc.nextInt();
            if(a[i] > a[i-1] && a[i] > a[i+1] ){
                count++;
            }
		}
	System.out.println(count);
}
}