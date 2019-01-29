package basis;

import java.util.Scanner;

public class alphabet_graphics {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt(); //ÐÐÊý
		int m=scanner.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int k=0;k<i;k++) {
//				System.out.print((char)(65+i-k));
//			}
//			for(int j=0;j<m-i;j++) {
//				System.out.print((char)(65+j));
//			}
//			System.out.print("\n");
//		}
		for(int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print((char)(65+Math.abs(i-j)));
			}
			System.out.print("\n");
		}
	}
}
