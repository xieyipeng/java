package past_exam;

import java.util.Scanner;

public class the_wrong_paper {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        scanner.nextLine();
        int[] data = new int[100];

        int size = 0;

        for (int i = 0; i < line; i++) {
            String tempLine = scanner.nextLine();
            String[] arr = tempLine.split("\\s+");
            for (String s : arr) {
                data[size] = Integer.valueOf(s);
                size++;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }


        int m = 0, n = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1] - 1) {
                if (data[i] == data[i + 1] - 2) {
                    m = data[i] + 1;
                }
                if (data[i] == data[i + 1]) {
                    n = data[i];
                }
            }
        }
        System.out.print(m + " " + n);
	}
}
