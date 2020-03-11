package past_exam;

import java.util.Scanner;

public class the_cion {
	
	public static int isSame(char[] c_original,char[] c_target) {
		for(int i=0;i<c_original.length;i++) {
			if(c_original[i]!=c_target[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isEqual(char[] c_original,char[] c_target) {
		for(int i=0;i<c_original.length;i++) {
			if(c_original[i]!=c_target[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String original=scanner.next();
		String target=scanner.next();
//		System.out.println(original);
//		System.out.println(target);
		char[] c_original=original.toCharArray();
		char[] c_target=target.toCharArray();
//		for(int i=0;i<c_original.length;i++) {
//			System.out.print(c_original[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<c_target.length;i++) {
//			System.out.print(c_target[i]+" ");
//		}
		int step=0;
		while(!isEqual(c_original,c_target)) {
			int start=isSame(c_original,c_target);
			if(c_original[start]=='*') {
				c_original[start]='o';
			}else {
				c_original[start]='*';
			}
			if(c_original[start+1]=='*') {
				c_original[start+1]='o';
			}else {
				c_original[start+1]='*';
			}
			step++;
		}
		System.out.print(step);
	}
}
