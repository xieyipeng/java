package test16;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int s=(int)Math.sqrt(num)+1;
        System.out.println(s);
        for (int a = 0; a < s; a++) {
            for (int b = a; b < s; b++) {
                for (int c = b; c < s; c++) {
                    int d = (int) Math.sqrt((num - a * a - b * b - c * c));
                    if (num == a * a + b * b + c * c + d * d) {
                        if (c > d) {
                            int temp = c;
                            c = d;
                            d = temp;
                        }
                        System.out.println(a+" "+b+" "+c+" "+d);
                        return;
                    }
                }
            }
        }
    }
}






//public class q8 {
//	static List<int[]> list=new ArrayList<>(); 
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int num=scanner.nextInt();
//		for(int a=0;a<3000;a++) {
//			if(a>num) {
//				continue;
//			}
//			for(int b=0;b<3000;b++) {
//				if(b>num) {
//					continue;
//				}
//				for(int c=0;c<3000;c++) {
//					if(c>num) {
//						continue;
//					}
//					int d=(int) Math.sqrt((num-a*a-b*b-c*c));
//					int arr[]= {a,b,c,d};
//					if(num==a*a+b*b+c*c+d*d) {
//						Arrays.sort(arr);
//						if(!mineContain(arr)) {
//							list.add(arr);
//						}
//					}
//				}
//			}
//		}
//		for(int i=0;i<list.size();i++) {
//			for(int j=0;j<list.get(i).length;j++) {
//				System.out.print(list.get(i)[j]+" ");
//			}
//			System.out.println();
//		}
//	}
//	private static boolean mineContain(int[] arr) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<list.size();i++) {
//			int[] temp=list.get(i);
//			if(temp[0]==arr[0]&&temp[1]==arr[1]&&temp[2]==arr[2]&&temp[3]==arr[3]) {
//				return true;
//			}
//		}
//		return false;
//	}
//}
