package test16;

public class q6 {
    private static int ans = 0;

    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(num, 0);
        System.out.print(ans);
    }

    private static void dfs(int[] num, int sub) {
        // TODO Auto-generated method stub
        if (sub == num.length) {
            if (ok(num)) {
                ans++;
            }
            return;
        }
        for (int i = sub; i < num.length; i++) {
            int temp = num[sub];
            num[sub] = num[i];
            num[i] = temp;

            dfs(num, sub + 1);

            temp = num[sub];
            num[sub] = num[i];
            num[i] = temp;

        }
    }

    private static boolean ok(int[] num) {
        // TODO Auto-generated method stub
        if (test0(num, new int[]{1, 3, 4, 5})) {
            return false;
        }
        if (test1(num, new int[]{0, 2, 4, 5, 6})) {
            return false;
        }
        if (test2(num, new int[]{1, 5, 6})) {
            return false;
        }
        if (test3(num, new int[]{0, 4, 7, 8})) {
            return false;
        }
        if (test4(num, new int[]{0, 1, 3, 5, 7, 8, 9})) {
            return false;
        }
        if (test5(num, new int[]{0, 1, 2, 4, 6, 8, 9})) {
            return false;
        }
        if (test6(num, new int[]{1, 2, 5, 9})) {
            return false;
        }
        if (test7(num, new int[]{3, 4, 8})) {
            return false;
        }
        if (test8(num, new int[]{3, 4, 5, 7, 9})) {
            return false;
        }
        if (test9(num, new int[]{4, 5, 6, 8})) {
            return false;
        }
        return true;
    }

    private static boolean check(int[] num, int[] is, int point) {
        // TODO Auto-generated method stub
        for (int i1 : is) {
            if (Math.abs(num[point] - num[i1]) == 1) {
                //相邻
                return true;
            }
        }
        //不相邻
        return false;
    }


    private static boolean test9(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 9);
    }

    private static boolean test8(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 8);
    }

    private static boolean test7(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 7);
    }

    private static boolean test6(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 6);
    }

    private static boolean test5(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 5);
    }

    private static boolean test4(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 4);
    }

    private static boolean test3(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 3);
    }

    private static boolean test2(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 2);
    }

    private static boolean test1(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 1);
    }

    private static boolean test0(int[] num, int[] is) {
        // TODO Auto-generated method stub
        return check(num, is, 0);
    }
}