package past_exam;

import java.util.Scanner;

public class walnut_num {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
//		System.out.print(a+" "+b+" "+c);
		int i;
		for (i=1;;i++) {
			if(i%a==0&&i%b==0&&i%c==0) {
				break;
			}
		}
		System.out.print(i);
	}
}
