package test13;
import java.util.*;
public class q1 {
	/**
     * TODO: 那一年就是那一年
     * TODO: 从0开始，即：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
     * TODO: 周日在前，即[周日, 周一, 周二, 周三, 周四, 周五, 周六]
     * System.out.print(calendar.getTime() + " | ");
     * System.out.print(calendar.get(Calendar.YEAR) + "-"); // 那一年就是那一年
     * System.out.print(calendar.get(Calendar.MONTH) + "-"); // 从0开始，即：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
     * System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + " ");
     * System.out.print(" week"+calendar.get(Calendar.DAY_OF_WEEK)+" "); // 周日在前，即[周日, 周一, 周二, 周三, 周四, 周五, 周六]
     * System.out.print(calendar.get(Calendar.HOUR_OF_DAY) + ":");
     * System.out.print(calendar.get(Calendar.MINUTE) + ":");
     * System.out.println(calendar.get(Calendar.SECOND));
     **/
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        System.out.println(calendar.getTime());
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            calendar.add(Calendar.YEAR, 100);
        }
        System.out.println(calendar.getTime());
    }
}
