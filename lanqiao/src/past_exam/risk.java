package past_exam;

import java.util.Scanner;

public class risk {
	private static int count=0;
	private static int n,e;
	private static int test0,test1;
	private static int edge[][];
	private static int visit[];
	public static void main(String args[]) {
		Scanner scanner =new Scanner(System.in);
		String temp=scanner.nextLine();
		String[] ne=temp.split(" ");
		n=Integer.valueOf(ne[0]);
		e=Integer.valueOf(ne[1]);
		visit=new int[n];
//		System.out.print(n+" "+e+"\n");
		edge=new int[n][n];
		for(int i=0;i<e;i++) {
			temp=scanner.nextLine();
			String num[]=temp.split(" ");
			edge[Integer.valueOf(num[0])-1][Integer.valueOf(num[1])-1]=1;
			edge[Integer.valueOf(num[1])-1][Integer.valueOf(num[0])-1]=1;
		}
		temp=scanner.nextLine();
		ne=temp.split(" ");
		test0=Integer.valueOf(ne[0])-1;
		test1=Integer.valueOf(ne[1])-1;
		visit[test0]=1;
		visit[test1]=1;
		
//		for(int j=0;j<n;j++) {
//			System.out.print(visit[j]+" ");
//		}
//		System.out.print("\n");
		
		for(int i=0;i<n;i++) {
			if(visit[i]==0) {
				//未被检查过且不是初始点
//				System.out.print("visit["+i+"]:"+visit[i]+"\n");
				int[] new_visit=new int[n];
				check(i,new_visit);
			}
		}
		
		System.out.print(n-2-count);
	}
	private static void check(int check_point,int[] new_visit) {
		// TODO Auto-generated method stub
		//去掉检查点相关的所有地道
		
//		System.out.print("\ncheck_point:"+check_point+"\n");
		int[][] new_edge=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				new_edge[i][j]=edge[i][j];
			}
		}
		

		
		
		for(int i=0;i<n;i++) {
			new_edge[check_point][i]=0;
			new_edge[i][check_point]=0;
		}
		
//		System.out.print("\nedge:\n");
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(new_edge[i][j]+" ");
//			}
//			System.out.print("\n");
//		}
//		System.out.print("\n");
		
		
		//看能否从test0到test1
		dfs(test0,new_visit,new_edge);
		
	}
	private static void dfs(int start,int[] new_visit,int[][] the_edge) {
		// TODO Auto-generated method stub
//		System.out.print("dfs:"+start+"\n");
//		for(int i=0;i<n;i++) {
//			System.out.print(new_visit[i]+" ");
//		}
//		System.out.print("\n");
		if(start==test1) {
//			System.out.print("count++\n");
			count++;
			return;
		}
		if(new_visit[start]==0) {
			new_visit[start]=1;
			for(int i=0;i<n;i++) {
				if(the_edge[start][i]==1) {
//					System.out.print("start:"+start+"-"+i+"\n");
//					System.out.print("the_edge:"+the_edge[start][i]+"\n");
					dfs(i,new_visit,the_edge);
				}
			}
		}
	}
}