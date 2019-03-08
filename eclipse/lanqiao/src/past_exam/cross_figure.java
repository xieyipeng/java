package past_exam;

import java.util.Scanner;

public class cross_figure {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int size=(n+1)*4+1;
		char[][] figure=new char[size][size];
		
		//左上
		for(int i=0;i<=size/2;i++) {
			for(int j=0;j<=size/2;j++) {
				if(Math.abs(i-j)<=1) {
					if((i==0&&j==0)) {
						figure[i][j]='.';
					}else {
						if(i==j) {
							if(i%2==1) {
								figure[i][j]='.';
							}
							if(i%2==0) {
								figure[i][j]='$';
							}
						}else if(i>j) {
								if(i%2==1) {
									figure[i][j]='.';
								}else {
									figure[i][j]='$';
								}
						}else {
							if(j%2==1) {
								figure[i][j]='.';
							}else {
								figure[i][j]='$';
							}
						}
					}
				}else if((i-j)>1) {
					if(j%2==0) {
						figure[i][j]='$';
					}else {
						figure[i][j]='.';
					}
				}else if((i-j)<-1) {
					if(i%2==0) {
						figure[i][j]='$';
					}else {
						figure[i][j]='.';
					}
				}
			}
		}
		//右上
		for(int i=0;i<=size/2;i++) {
			for(int j=size/2+1;j<size;j++) {
				figure[i][j]=figure[i][size-j-1];
			}
		}
		//左下
		for(int i=size/2+1;i<size;i++) {
			for(int j=0;j<=size/2;j++) {
				figure[i][j]=figure[size-i-1][j];
			}
		}
		//右下
		for(int i=size/2+1;i<size;i++) {
			for(int j=size/2+1;j<size;j++) {
				figure[i][j]=figure[i][size-j-1];
			}
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(figure[i][j]);
			}
			System.out.print("\n");
		}
	}
}
