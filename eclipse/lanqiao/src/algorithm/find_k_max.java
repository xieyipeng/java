package algorithm;

import java.util.*;
public class find_k_max {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] all_array=new int[size];
		for(int i=0;i<size;i++) {
			all_array[i]=scanner.nextInt();
		}
		int ask_num=scanner.nextInt();
		int[][] flag=new int[ask_num][3];
		for(int i=0;i<ask_num;i++) {
			flag[i][0]=scanner.nextInt();
			flag[i][1]=scanner.nextInt();
			flag[i][2]=scanner.nextInt();
		}
		
		for(int i=0;i<ask_num;i++) {
			int size_small=flag[i][1]-flag[i][0]+1;
			int[] temp=new int[size_small];
			for(int j=0;j<size_small;j++) {
				temp[j]=all_array[flag[i][0]+j-1];
			}
			for(int j=0;j<size_small;j++) {
				for(int k=j;k<size_small;k++) {
					if(temp[j]<temp[k]) {
						int a=temp[j];
						temp[j]=temp[k];
						temp[k]=a;
					}
				}
			}
			System.out.print(temp[flag[i][2]-1]+"\n");
		}
	}
}
