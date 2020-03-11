package test15;

public class q6 {
	public static void main(String[] args) {

		for(int i=1;i<48;i++) {
			for(int j=i+1;j<=48;j++) {
				int[] num=new int[49];
				for(int k=0;k<49;k++) {
					num[k]=k+1;
				}
				if(getNum(num,i,j)==2015) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

	private static int getNum(int[] num, int i, int j) {
		// TODO Auto-generated method stub
//		System.out.print(i+" "+j+"\n");
		
//		for(int k=0;k<49;k++) {
//			System.out.print(num[k]+" ");
//		}
//		System.out.print("\n");
		
		int ans=0;
		if(Math.abs(i-j)==1) {
			//三个数连乘
			int a,b,c;
			a=num[i-1];
			b=num[i];
			c=num[j];
			
			num[i-1]=0;
			num[i]=0;
			num[j]=0;
			ans+=mul(num);
			ans+=a*b*c;
			return ans;
		}else {
			//四个数，两两分开乘
			int a,b,c,d;
			a=num[i-1];
			b=num[i];
			c=num[j-1];
			d=num[j];
			
			num[i-1]=0;
			num[i]=0;
			num[j-1]=0;
			num[j]=0;
			ans+=mul(num);
			ans+=a*b+c*d;
			return ans;
		}
	}

	private static int mul(int[] num) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i=0;i<num.length;i++) {
			ans+=num[i];
		}
		return ans;
	}
}
