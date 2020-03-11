package past_exam;

import java.util.Arrays;
import java.util.Scanner;

public class with_score {
	private static int count=0;
	private static int num;
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		int[] arr={1,2,3,4,5,6,7,8,9};
//		int[] arr={1,2,3};
		f(0,arr);
		System.out.print(count);
	}

	private static void f(int sub,int[] arr) {
		// TODO Auto-generated method stub
		if(sub>arr.length-1) {
			check(arr);
		}
		
		for(int i=sub;i<arr.length;i++) {
			int temp=arr[i];
			arr[i]=arr[sub];
			arr[sub]=temp;
//			System.out.print(Arrays.toString(arr)+"\n");
			f(sub+1,arr);
			
			temp=arr[i];
			arr[i]=arr[sub];
			arr[sub]=temp;
		}
	}

	private static void check(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length-1;i++) {
			int num_1=toInt(arr,0,i);
			if(num_1>=num) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				int num_2=toInt(arr,i,j);
				int num_3=toInt(arr,j,arr.length);
				if(num_2%num_3==0&&num_1+num_2/num_3==num) {
//					System.out.println(num_1+" "+num_2+" "+num_3);
					count++;
				}
			}
		}
	}

	private static int toInt(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
//		System.out.println(start+" "+end);
		int ans=0;
		int t=1;
		for(int i=end-1;i>=start;i--) {
			ans+=arr[i]*t;
			t*=10;
		}
		return ans;
	}
}
