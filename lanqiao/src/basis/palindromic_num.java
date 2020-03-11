package basis;

public class palindromic_num {
	public static void main(String args[]) {
		for(int i=1000;i<=9999;i++) {
			int num1000=i/1000;
			int num100=i/100-num1000*10;
			int num10=(i-num100*100-num1000*1000)/10;
			int num0=i%10;
			if(num1000==num0&&num100==num10) {
				System.out.print(i+"\n");
			}
		}
	}
}
