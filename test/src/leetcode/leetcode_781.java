package leetcode;

import java.util.Arrays;

public class leetcode_781 {
    private static int numRabbits(int[] answers) {
        if (answers.length == 0) {
            return 0;
        }
        int[] a = new int[1000];
        //TODO: 排序
        Arrays.sort(answers);
        //TODO: 统计a[i]的个数
        int pre = answers[0];
        int num = 0;
        int flag = 0;
        for (int i = 0; i < answers.length; i++) {
            if (pre == answers[i]) {
                num++;
                for (int j = flag; j <= i; j++) {
                    a[j] = num;
                }
            } else {
                flag = i;
                num = 1;
                pre = answers[flag];
                a[flag] = num;
            }
        }
        //TODO: 将相同数字a按照每a+1个分组
        int color = 0;
        flag = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0) {
                color++;
                flag = answers[i];
                continue;
            }
            if (i == answers.length - 1) {
                if (answers[i] == answers[i - 1]) {
                    break;
                } else {
                    int size = answers[i] + 1;
                    color = color + size;
                }
            } else {
                if (answers[i] != flag) {
                    int size = answers[i] + 1;
                    int zongshu = a[i];
                    int zu = zongshu / size;
                    if (zu * size != zongshu) {
                        zu = zu + 1;
                    }
                    color = color + zu * size;
                }
            }
            flag = answers[i];
        }
        return color;
    }

    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 0, 0, 1};
        System.out.println(numRabbits(c));
    }
}
