package test16;

public class q3 {
    static int ans = 0;
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//a
            for (int j = 1; j <= 9; j++) {//b
                if (j != i)
                    for (int k = 1; k < 10; k++) {//c
                        if (k != j && k != i)
                            for (int l = 1; l < 10; l++) {//d
                                if (l != k && l != j && l != i)
                                    for (int m = 1; m < 10; m++) {//e
                                        if (m != k && m != j && m != i && m != l)
                                            for (int n = 1; n < 10; n++) {//f
                                                if (n != m && n != k && n != j && n != i && n != l)
                                                    for (int o = 1; o < 10; o++) {//g
                                                        if (o != n && o != m && o != l && o != k && o != j && o != i)
                                                            for (int p = 1; p < 10; p++) {//h
                                                                if (p != o && p != n && p != m && p != l && p != k && p != j && p != i)
                                                                    for (int q = 1; q < 10; q++) {//i
                                                                        if (q != p && q != o && q != n && q != m && q != l && q != k && q != j && q != i) {
                                                                            int n1 = o * 100 + p * 10 + q;
                                                                            int n2 = l * 100 + m * 10 + n;
                                                                            if (i * k * n1 + j * n1 + n2 * k == 10 * k * n1) {
                                                                                ans++;
                                                                                System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q);
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
        }
        System.out.println(ans);
    }
}
