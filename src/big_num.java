import java.math.BigDecimal;

public class big_num {
    public static void main(String[] args) {
        long a = 3;
        BigDecimal num1 = new BigDecimal(String.valueOf(a));
        long b = 1;
        BigDecimal num2 = new BigDecimal(String.valueOf(b));
        System.out.println(num2.divide(num1,100, BigDecimal.ROUND_HALF_UP));
//        0.3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
    }
}
