package test15;

import java.util.Vector;

public class q4 {
	public static int f(int n, int m){
		n = n % m;
		Vector v = new Vector();
		for(;;){
			v.add(n);
			n = n * 10;
			n = n % m;
			for(int j=0;j<v.size();j++) {
				System.out.print(v.get(j)+" ");
			}
			System.out.print("\n");
			if(n==0) return 0;//整除
			if(v.indexOf(n)>=0) {
				//填空
//				System.out.print(v.indexOf(n));
				return v.size();
			}
		}
	}

	public static void main(String[] args) {
		System.out.print(f(12,13));
	}
}
