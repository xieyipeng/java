package basis;

import java.util.*;
public class sequence {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] num=new int[size];
		for (int i=0;i<size;i++) {
			num[i]=scanner.nextInt();
		}
		int sum=0;
		int max_num=num[0];
		int min_num=num[0];
		for (int i=0;i<size;i++) {
			sum=sum+num[i];
			if(num[i]<min_num) {
				min_num=num[i];
			}
			if(num[i]>max_num) {
				max_num=num[i];
			}
		}
		System.out.print(max_num+"\n");
		System.out.print(min_num+"\n");
		System.out.print(sum+"\n");
	}
}
