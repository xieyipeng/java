package basis;

import java.util.*;
public class pascal {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int[][] pas=new int[34][34];
		for(int i=0;i<num;i++) {
			pas[i][0]=1;
			pas[i][i]=1;
			for(int j=1;j<i;j++) {
				pas[i][j]=pas[i-1][j-1]+pas[i-1][j];
			}
			for(int k=0;k<=i;k++) {
				System.out.print(pas[i][k]+" ");
			}
			System.out.print("\n");
		}
	}
}
