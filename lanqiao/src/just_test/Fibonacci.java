package just_test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		//FibonacciÊıÁĞ
		int Fibonacci[]=new int[1000000];
		int div=10007;
		Fibonacci[0]=1;
		Fibonacci[1]=1;
		Scanner scanner = new Scanner(System.in);
		//System.out.print("please input a number 'n', 1 <= n <= 1000000\n");
		int num = scanner.nextInt();
		for(int i=2;i<1000000;i++) {
			Fibonacci[i]=(Fibonacci[i-1]+Fibonacci[i-2])%div;
		}
		System.out.print(Fibonacci[num-1]);
	}
}
