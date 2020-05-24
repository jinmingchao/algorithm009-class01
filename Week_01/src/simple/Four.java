package simple;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 21:33
 * @Description: https://leetcode-cn.com/problems/rotate-array/
 */
public class Four {

    public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }
}
