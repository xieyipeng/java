package test16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        int[] ans = new int[size];
        scanner.nextLine();
        String numString = scanner.nextLine();
        String[] temp = numString.split("\\s+");
        for (int i = 0; i < temp.length; i++) {
            num[i] = Integer.valueOf(temp[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = getAns(num, num[i], i);
        }
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

    /**
     * TODO: 分解问题
     * @param num 原数组
     * @param test 序号对应的值
     * @param i 分解问题序号
     * @return 问题答案
     */
    private static int getAns(int[] num, int test, int i) {
        //没有出现过
        if (i == 0) {
            return num[i] * (-1);
        }
        int[] sub = new int[i + 1];
        if (sub.length >= 0) System.arraycopy(num, 0, sub, 0, sub.length);
        int firstNode = mineContain(sub, test);
        if (firstNode == -1) {
            return num[i] * (-1);
        } else {
            //在之前出现过
            int lastNode = getLastNode(sub, test);
            List<Integer> list = new ArrayList<>();
            for (int j = lastNode + 1; j < i; j++) {
                if (!list.contains(num[j])) {
                    list.add(num[j]);
                }
            }
            return list.size();
        }
    }

    /**
     * TODO: 获取test在sub[]中所对应的最后一个下标
     * @param sub 新数组
     * @param test 获取值
     * @return 下标
     */
    private static int getLastNode(int[] sub, int test) {
        int ans = 0;
        for (int i = 0; i < sub.length - 1; i++) {
            if (sub[i] == test) {
                ans = i;
            }
        }
        return ans;
    }

    /**
     * TODO: 判断sub[]数组是否包含test值
     * @param sub 数组
     * @param test 判断的值
     * @return 是否包含
     */
    private static int mineContain(int[] sub, int test) {
        for (int i = 0; i < sub.length - 1; i++) {
            if (sub[i] == test) {
                return i;
            }
        }
        return -1;
    }
}




