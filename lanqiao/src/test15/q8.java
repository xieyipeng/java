package test15;

import java.util.Scanner;

public class q8 {
	static int ans=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		ans+=num;
		while(num>=3) {
			int temp=num%3;
			int shang=num/3;
//			System.out.print(num+" = "+shang+" * 3 + "+temp+"\n");
			ans+=shang;
			num=shang+temp;
		}
		System.out.print(ans);
	}
}
