package algorithm;

import java.util.*;
class find_k_good_num {
	
	public static char[] toScaleN(int i,int scale,int digit) {
		char[] remainder=new char[digit];
		if(scale>=1&&scale<=10) {
			//1~10进制
			for(int j=0;j<digit;j++) {
				int rem=i%scale;
				if(rem==0) {
					//可以整除
					remainder[digit-j-1]='0';
					i=i/scale;
				}else {
					remainder[digit-j-1]=refer_no(rem);
					i=(i-rem)/scale;
				}
			}
			return remainder;
		}else {
			//11~16进制
			
			for(int j=0;j<digit;j++) {
				int rem=i%scale;
				if(rem==0) {
					//可以整除
					remainder[digit-j-1]='0';
					i=i/scale;
				}else {
					remainder[digit-j-1]=refer_no(rem);
					i=(i-rem)/scale;
				}
			}
			return remainder;
			
//			while(i!=0) {
//				int rem=i%scale;
//				if(rem==0) {
//					//可以整除
//					remainder.add('0');
//					i=i/scale;
//				}else {
//					if(rem>=10) {
//						remainder.add((char)(65+rem-10));
//					}else {
//						remainder.add((char)rem);
//					}
//					i=(i-rem)/scale;
//				}
//			}
//			Collections.reverse(remainder);
//			return remainder;
		}
	}
	
	public static int refer(char i) {
		switch(i) {
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		}
		return 0;
	}
	
	public static char refer_no(int i) {
		switch(i) {
		case 1:
			return '1';
		case 2:
			return '2';
		case 3:
			return '3';
		case 4:
			return '4';
		case 5:
			return '5';
		case 6:
			return '6';
		case 7:
			return '7';
		case 8:
			return '8';
		case 9:
			return '9';
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int scale=scanner.nextInt();//进制
		int digit=scanner.nextInt();//位数
		int num=0;
		
		if(scale==1) {
			//1进制
			System.out.print(num);
		}else {
			int[] temp=new int[digit*scale];

			for(int i=0;i<Math.pow(scale, digit);i++) {
				
				boolean have=false;
				boolean isZero=false;

//				System.out.print("i == "+i+"\n");
				char[] rem_char=toScaleN(i,scale,digit);
				
//				for(int j=0;j<rem_char.length;j++) {
//					System.out.print(rem_char[j]+" ");
//				}
//				System.out.print("\n");
				
				
				if(refer(rem_char[0])==0) {
					isZero=true;
				}
				
				for(int j=0;j<rem_char.length-1;j++) {
//					System.out.print("test: "+refer(rem_char[j])+"/"+refer(rem_char[j+1])+"\n");
					if(refer(rem_char[j])==refer(rem_char[j+1])+1||
							refer(rem_char[j])==refer(rem_char[j+1])-1) {
						//存在相邻数字
						

						have=true;
						break;
					}
				}
				
				if(!isZero) {
					if(!have) {
						num++;
//						System.out.print("\n+1\n");
					}
				}
//				System.out.print("\n"+have+"\n--------------\n");
			}
			System.out.print(num);
		}
	}
	
//动态规划
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//        int L = scanner.nextInt();
//        scanner.close();
//        //		int K = 4;
//        // 		int L = 2;
//
//        int[][] dp = new int[101][101];
//        Arrays.fill(dp[1], 1);
//        for (int i = 2; i <= L; i++) {
//            int j = 0;
//            if (i == 2) {
//                j = 1;
//            }
//            for (; j < K; j++) {
//                for (int k = 0; k < K; k++) {
//                    if (Math.abs(k - j) != 1) {
//                        dp[i][j] += dp[i - 1][k];
////                        System.out.println("dp[" + i + "][" + j + "] += dp[" + (i - 1) + "][" + k + "]");
//                    }
//                }
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < K; i++) {
//            sum += dp[L][i];
//        }
//        System.out.println(sum % num);
////
////        for (int i = 0; i <= L; i++) {
////            for (int j = 0; j <= K; j++) {
////                System.out.print(dp[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//
//    }
}
