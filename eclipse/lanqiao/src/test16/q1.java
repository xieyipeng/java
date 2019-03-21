package test16;

public class q1 {
	static int ans=0;
	public static void main(String[] args) {
		int[] num=new int[100];
		num[0]=1;
		for(int i=1;i<100;i++) {
			num[i]=num[i-1]+i+1;
//			System.out.println(num[i]);
		}		
		for(int i=0;i<100;i++) {
			ans+=num[i];
//			System.out.println(num[i]);
		}
		System.out.print(ans);
	}
}
