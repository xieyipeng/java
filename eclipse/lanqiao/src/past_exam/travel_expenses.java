package past_exam;

import java.util.Scanner;

public class travel_expenses {
	
	private static int[][] edge;
	private static int[][] cost;
	private static int n,e;
	private static final int MAX=9999;
	private static int visit[];
	private static int num;
	private static int MAX_COST=0;
	//n: 顶点总数
	//e: 边数
	
	public static int getMoney(int all_length) {
		int count=0;
		for(int i=0;i<=all_length;i++) {
			count+=all_length;
		}
		return count+all_length*10;
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		n=Integer.valueOf(scanner.nextLine());
		e=n-1;
		int max_expenses=0;
		edge=new int[n][n];
		cost=new int[n][n];
		visit=new int[n];
		//初始化
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					edge[i][j]=0;
				}else {
					edge[i][j]=MAX;
				}
			}
		}
		for(int i=0;i<n-1;i++) {
			String temp=scanner.nextLine();
			String[] edge_temp=temp.split("\\s+");
			edge[Integer.valueOf(edge_temp[0])-1][Integer.valueOf(edge_temp[1])-1]=Integer.valueOf(edge_temp[2]);
			edge[Integer.valueOf(edge_temp[1])-1][Integer.valueOf(edge_temp[0])-1]=Integer.valueOf(edge_temp[2]);
		}
		for(int i=0;i<n;i++) {
			DfsTraverse(i);
		}
		
		System.out.print(getResult(MAX_COST));
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(cost[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		System.out.println();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(edge[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

	private static int getResult(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		return (sum+num*10);
	}

	private static void DfsTraverse(int start) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			visit[i]=0;
		}
		visit[start]=1;
		num=1;
		int[] node_path=new int[1];
		node_path[0]=start;
		dfs(start,node_path);
	}

	private static void dfs(int i,int node_path[]) {
		// TODO Auto-generated method stub
		num++;
		for(int j=0;j<n;j++) {
			if(i==j) {
				continue;
			}else{
				if(edge[i][j]!=0&&edge[i][j]!=MAX&&visit[j]==0) {
					int[] path=new int[num];
					for(int k=0;k<node_path.length;k++) {
						path[k]=node_path[k];
					}
					path[num-1]=j;
					
					int temp=0;
					for(int k=0;k<num-1;k++) {
						temp=temp+edge[path[k]][path[k+1]];
					}
					if(temp>MAX_COST) {
						MAX_COST=temp;
					}
					visit[j]=1;
					dfs(j,path);
					num--;
				}
			}
		}
	}
}
