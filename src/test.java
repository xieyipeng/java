import java.util.ArrayList;
import java.util.List;

public class test {
    static int size = 0;
    private static List<int[]> arr = new ArrayList<>();

    public static void main(String[] args) {


        dfs(0, 0);
        System.out.print(size);
    }

    private static void dfs(int num, int sum) {
        // TODO Auto-generated method stub]\
        if (sum>13){
            return;
        }
        if (num==13){
            if (sum==13){
                size++;
            }
        }else {
            for (int i=0;i<5;i++){
                dfs(num+1,sum+i);
            }
        }
    }

    private static int allOne(int[] flag) {
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static boolean mineEqual(int[] is, int[] num) {
        // TODO Auto-generated method stub
        boolean same = true;
        for (int i = 0; i < is.length; i++) {
            if (is[i] != num[i]) {
                same = false;
            }
        }
        return same;
    }

    private static int mineSum(int[] num) {
        // TODO Auto-generated method stub
        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            ans += num[i];
        }
        return ans;
    }
//    private static int ans=0;
//    static void dfs(int type, int sum) {
//        if (sum > 13) return;
//        if (type == 13) {
//            if (sum == 13) ans++;
//            return;
//        }
//        for (int i = 0; i < 5; i++) {
//            dfs(type + 1, sum + i);
//        }
//    }
//
//    public static void main(String[] args) {
//        dfs(0, 0);
//        System.out.println(ans);
//    }
}
