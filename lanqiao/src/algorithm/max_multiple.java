package algorithm;

import java.util.*;
public class max_multiple {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		long num=scanner.nextInt();
		if(num%2==0) {
			//偶数
			if(num%3==0) {
				//是3的倍数
				System.out.print((num-1)*(num-2)*(num-3));
			}else {
				//不是3的倍数
				System.out.print(num*(num-1)*(num-3));
			}
		}else {
			//奇数
			System.out.print(num*(num-1)*(num-2));
		}
	}
}
