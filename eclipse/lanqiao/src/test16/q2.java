package test16;

public class q2 {
	public static void main(String[] args) {
		for(int year=0;year<100;year++) {
			System.out.print("-------------"+year+"-------------\n");
			int num=236;
			int i=year;
			while(num>0) {
				num=num-i;
				System.out.print("newNum: "+num+"\n");
				if(num==0) {
					System.out.print(year);
					return;
				}
				i++;
			}
		}
	}
}
