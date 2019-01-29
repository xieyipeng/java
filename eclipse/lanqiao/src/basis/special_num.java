package basis;

public class special_num {
	public static void main(String args[]) {
		for(int i=100;i<=999;i++) {
			int num100=i/100;
			int num10=(i-num100*100)/10;
			int num0=i%10;
			if(i==num0*num0*num0+num10*num10*num10+num100*num100*num100) {
				System.out.print(i+"\n");
			}
		}
	}
}
