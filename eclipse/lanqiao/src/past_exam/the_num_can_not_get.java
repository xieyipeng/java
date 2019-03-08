package past_exam;

import java.util.Scanner;

public class the_num_can_not_get {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.print(num1*num2-num1-num2);
	}
}
