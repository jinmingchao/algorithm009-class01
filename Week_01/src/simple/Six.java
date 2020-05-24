package simple;

import java.util.Arrays;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 21:46
 * @Description: https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Six {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        int[] nums1 = new int[9], nums2 = new int[]{2, 5, 6};
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        merge(nums1, 6, nums2, 3);
        for (int n : nums1) {
            System.out.println(n);
        }
    }
}
