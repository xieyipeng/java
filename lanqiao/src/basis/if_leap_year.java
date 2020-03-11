package basis;

import java.util.*;
public class if_leap_year {
	public static void main(String args[]) {
		Scanner scanner =new Scanner(System.in);
		int year = scanner.nextInt();
		if(year%4==0&&year%100!=0) {
			System.out.print("yes");
		}else if(year%400==0) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
	}
}
