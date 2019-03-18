import java.util.Scanner;

public class test {
    private static int candyNum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        scanner.nextLine();
        String[] temp = scanner.nextLine().split("\\s+");
        int[] allNum = new int[studentNum];
//        for (int i = 0; i < studentNum; i++) {
//            System.out.print(temp[i] + "-");
//        }
        for (int i = 0; i < studentNum; i++) {
            allNum[i] = Integer.parseInt(temp[i]);
        }

        while (!same(allNum)) {
//            System.out.println("while:");
            int[] after = new int[allNum.length];
            for (int i = 0; i < allNum.length; i++) {
                if (i == 0) {
                    after[i] = (allNum[i] / 2) + (allNum[allNum.length - 1] / 2);
                } else {
                    after[i] = (allNum[i] / 2) + (allNum[i - 1] / 2);
                }
            }
//            System.out.println("change:");
            for (int i = 0; i < allNum.length; i++) {

                if (after[i] % 2 == 1) {
                    after[i] = after[i] + 1;
                    candyNum++;
                }
                allNum[i] = after[i];
            }
        }
//		System.out.print(Arrays.toString(allNum));
        System.out.print(candyNum);
    }

    /**
     * 检查数组内各值是否相等
     *
     * @param allNum 数组
     * @return 是或否
     */
    private static boolean same(int[] allNum) {
        // TODO Auto-generated method stub
        int test = allNum[0];
        for (int i = 1; i < allNum.length; i++) {
            if (test != allNum[i]) {
//                System.out.println(false);
                return false;
            }
        }
        return true;
    }
}
