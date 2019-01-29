package basis;

import java.util.*;
public class special_palindromic_num {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=10000;i<=999999;i++) {
			int num100000=i/100000;
			int num10000=(i-num100000*100000)/10000;
			int num1000=(i-num100000*100000-num10000*10000)/1000;
			int num100=(i-num100000*100000-num10000*10000-num1000*1000)/100;
			int num10=(i-num100000*100000-num10000*10000-num1000*1000-num100*100)/10;
			int num0=i%10;
			if(num100000+num10000+num1000+num100+num10+num0==num) {
				if(num100000==0) {
					if(num10000==num0&&num10==num1000) {
						System.out.print(i+"\n");
					}
				}else {
					if(num100000==num0&&num10==num10000&&num100==num1000) {
						System.out.print(i+"\n");
					}
				}
			}
		}
	}
}
