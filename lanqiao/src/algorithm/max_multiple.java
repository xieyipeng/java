package algorithm;

import java.util.*;
public class max_multiple {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		long num=scanner.nextInt();
		if(num%2==0) {
			//ż��
			if(num%3==0) {
				//��3�ı���
				System.out.print((num-1)*(num-2)*(num-3));
			}else {
				//����3�ı���
				System.out.print(num*(num-1)*(num-3));
			}
		}else {
			//����
			System.out.print(num*(num-1)*(num-2));
		}
	}
}
