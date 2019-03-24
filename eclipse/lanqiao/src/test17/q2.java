package test17;

import java.util.ArrayList;
import java.util.List;

public class q2 {
    private static List<int[]> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(num, 0);
        //一个排列旋转、镜像之后有6种，因此除以6
        System.out.println(list.size()/6);
    }

    private static void dfs(int[] num, int sub) {
        if (sub == num.length) {
            if (ok(num)){
                list.add(num);
            }
            return;
        }

        for (int i = sub; i < num.length; i++) {
            int temp = num[i];
            num[i] = num[sub];
            num[sub] = temp;

            dfs(num, sub + 1);

            temp = num[i];
            num[i] = num[sub];
            num[sub] = temp;

        }


    }

    private static boolean ok(int[] num) {
        return num[0] + num[1] + num[3] + num[5] == num[0] + num[2] + num[4] + num[8] && num[0] + num[2] + num[4] + num[8] == num[5] + num[6] + num[7] + num[8];
    }

}




