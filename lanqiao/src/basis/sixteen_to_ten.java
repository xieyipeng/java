package basis;

import java.util.*;

public class sixteen_to_ten {
	
    public static int getTenNum(char six_num) {
        if (six_num >= 48 && six_num <= 57) {
            return six_num - 48;
        } else {
            return 10 + six_num - 65;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sixteen_num = scanner.nextLine();
        char[] six_char = sixteen_num.toCharArray();
        int ten_num = 0;
        for (int i = 0; i < six_char.length; i++) {
            System.out.print(ten_num + " + " + getTenNum(six_char[i]) + " * " + (int) Math.pow(16, six_char.length - i - 1) + "\n");
            ten_num = ten_num + getTenNum(six_char[i]) * (int) Math.pow(16, six_char.length - i - 1);
        }
        System.out.print(ten_num);
    }
}
