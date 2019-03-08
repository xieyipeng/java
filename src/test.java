
import java.util.Scanner;

public class test {

    private static int[][] edge;
    private static int n, e;
    //n: 顶点总数
    //e: 边数

    public static int getMoney(int all_length) {
        int count = 0;
        for (int i = 0; i <= all_length; i++) {
            count += all_length;
        }
        return count + all_length * 10;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.valueOf(scanner.nextLine());
        e = n - 1;
        int max_expenses = 0;
        edge = new int[n][n];
        //初始化
        for (int i = 0; i < n; i++) {

        }
        for (int i = 0; i < n-2; i++) {
            System.out.println(i+":");
            String temp = scanner.nextLine();
            String[] edge_temp = temp.split("\\s+");
            System.out.println((edge_temp[0]) + " " +(edge_temp[1]) + " " + (edge_temp[2]));
            edge[Integer.valueOf(edge_temp[0]) - 1][Integer.valueOf(edge_temp[1]) - 1] = Integer.valueOf(edge_temp[2]);
            edge[Integer.valueOf(edge_temp[1]) - 1][Integer.valueOf(edge_temp[0]) - 1] = Integer.valueOf(edge_temp[2]);
        }
//		for(int i=1;i<=num;i++) {
//			dfs(i,num,edge);
//		}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(edge[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int i, int num, int[][] edge) {
        // TODO Auto-generated method stub
        for (int j = 1; j <= num; j++) {
            if (i == j) {
                continue;
            } else {
                if (edge[i][j] != 0) {
                    //可达

                }
            }
        }
    }
}

//0    2      1     9999  9999
//2    0      9999  5     4
//1    9999   0     9999  9999
//9999 5      9999  0     9999
//9999 4      9999  9999  0
