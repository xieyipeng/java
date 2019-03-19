import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        for (int a = 1; a < 2; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            for (int f = 0; f < 10; f++) {
                                for (int g = 0; g < 10; g++) {
                                    for (int h = 0; h < 10; h++) {
                                        int[] t = {a, b, c, d, e, f, g, h};
                                        int n1 = f * 1000 + d * 100 + e * 10 + g;
                                        int n2 = a * 1000 + b * 100 + c * 10 + d;
                                        int sum = n1 + n2;
                                        int n3 = a * 10000 + b * 1000 + e * 100 + d * 10 + h;
                                        if ((n1 + n2) == n3 && !haveSame(t)) {
                                            System.out.println(n1 + " " + n2 + " " + sum + " " + " " + n3);
                                            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    /**
     * 判断数组中是否存在相同的值
     *
     * @param ab 数组
     * @return 是否存在
     */
    private static boolean haveSame(int[] ab) {
        // TODO Auto-generated method stub
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < ab.length; i++) {
            if (temp.contains(ab[i])) {
                return true;
            } else {
                temp.add(ab[i]);
            }
        }
        return false;
    }
}
