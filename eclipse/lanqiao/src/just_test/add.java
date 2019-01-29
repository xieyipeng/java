package just_test;

import java.util.*;

public class add {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		long num=scanner.nextLong();
		long sum=((num+1)*num)/2;
//		for(int i=1;i<=num;i++) {
//			sum=sum+i;
//		}
		System.out.print(sum);
	}
}
