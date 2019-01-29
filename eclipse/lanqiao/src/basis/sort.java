package basis;

import java.util.*;
public class sort {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] array =new int[size];
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
