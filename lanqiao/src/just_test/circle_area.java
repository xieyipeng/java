package just_test;

import java.util.Scanner;
public class circle_area {
	final static double PI=Math.atan(1.0)*4;
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int radius=scanner.nextInt();
		System.out.print(String.format("%.7f", radius*radius*PI));
	}
}
