package basis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class ten_to_sixteen {

    public static final int SCALE = 16;

    public static String ten2sixteen(int num) {
        if (num >= 10) {
            return String.valueOf((char) (num + 55));
        } else {
            return String.valueOf(num);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List remainder = new ArrayList();
        while (true) {
            remainder.add(ten2sixteen(num % SCALE));
            num = num / SCALE;
            if (num == 0) {
                break;
            }
        }
        for (int i = remainder.size() - 1; i >= 0; i--) {
            System.out.print(remainder.get(i));
        }
    }
}
