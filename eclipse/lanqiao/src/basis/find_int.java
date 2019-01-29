package basis;

import java.util.*;
public class find_int {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] num=new int[size];
		for (int i=0;i<size;i++) {
			num[i]=scanner.nextInt();
		}
		int flag=scanner.nextInt();
		for (int i=0;i<size;i++) {
			if(num[i]==flag) {
				System.out.print(i+1);
				return;
			}
		}
		System.out.print(-1);
	}
}
