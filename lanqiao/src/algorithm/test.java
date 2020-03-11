package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int sum=0;
		Scanner ns=new Scanner(System.in);
		Scanner ms=new Scanner(System.in);
		int n=ns.nextInt();
		if(n>=1&&n<=10000) {
			int [] a=new int[n];
			for(int i=0;i<n;i++) {
				int m=ms.nextInt();
				a[i]=m;
				sum=sum+a[i];
			}
	        Arrays.sort(a);
	        System.out.println(a[n-1]);
	        System.out.println(a[0]);
	        System.out.println(sum);
		}
	}
}
