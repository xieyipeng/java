package past_exam;

import java.util.Arrays;
import java.util.Scanner;
public class num_continuous_section {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size = scanner.nextInt();
//		System.out.println(size);
		int[] num=new int[size];
		int count=0;
		for(int i=0;i<size;i++) {
			num[i]=scanner.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
//				int[] new_data=Arrays.copyOfRange(num, i, j);
				int[] new_data=new int[j-i+1];
				for(int k=0;k<new_data.length;k++) {
					new_data[k]=num[k+i];
				}
				Arrays.sort(new_data);
//				System.out.print("\n");
//				for(int k=0;k<new_data.length;k++) {
//					System.out.print(new_data[k]+" ");
//				}
				if(new_data[new_data.length-1]-new_data[0]==new_data.length-1) {
//					System.out.println("\n"+i+" "+j+" count++ :"+new_data[new_data.length-1]+"-"+new_data[0]+"="+(new_data.length-1));
					count++;
				}
			}
		}
		System.out.print(count+size);
	}
}
