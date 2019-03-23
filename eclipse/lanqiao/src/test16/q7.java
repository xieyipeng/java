package test16;

//排列组合
public class q7 {
	public static void main(String[] args) {
		int count = 0; 
		int a[] = new int[5];
        for (a[0] = 0; a[0] < 12; a[0]++) {
            for (a[1] = a[0] + 1; a[1] < 12; a[1]++) {  
                for (a[2] = a[1] +1 ; a[2] < 12; a[2]++) {  
                    for (a[3] = a[2]+1; a[3] < 12; a[3]++) {  
                        for (a[4] = a[3]+1; a[4] < 12; a[4]++) {  
                        	System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+"\n");
                        	count++;
                        }  
                    }  
                }  
            }  
        }
        System.out.print(count);
	}
}
