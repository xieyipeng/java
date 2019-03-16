import java.util.ArrayList;
import java.util.List;


/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 你可以假设 nums1 和 nums2 不同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 */

public class leetcode_4 {
    public static Double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        List<Integer> list = new ArrayList<>();
        int nums1_flag = 0;
        int nums2_flag = 0;


        if (nums1.length == 0 || nums2.length == 0) {
            for (int i = 0; i < nums1.length; i++) {
                list.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                list.add(nums2[i]);
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (nums1[nums1_flag] <= nums2[nums2_flag]) {
                    list.add(nums1[nums1_flag]);
                    nums1_flag++;
                    if (nums1_flag == nums1.length) {
                        for (int j = nums2_flag; j < nums2.length; j++) {
                            list.add(nums2[j]);
                        }
                        break;
                    }
                } else {
                    list.add(nums2[nums2_flag]);
                    nums2_flag++;
                    if (nums2_flag == nums2.length) {
                        for (int j = nums1_flag; j < nums1.length; j++) {
                            list.add(nums1[j]);
                        }
                        break;
                    }
                }
            }
        }
        if (list.size() % 2 == 0) {
            return (((double) list.get(list.size() / 2) + (double) list.get((list.size() / 2) - 1)) / 2);
        } else {
            return (double) (list.get(list.size() / 2));
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{};
        int b[] = new int[]{4, 5, 6};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
