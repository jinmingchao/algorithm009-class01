package simple;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 20:37
 * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Three {
    public static int removeDuplicates(int[] nums) {
        Deque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < nums.length; i++) {
            if (!deque.contains(nums[i])) {
                deque.addFirst(nums[i]);
            }
        }

        int l = deque.size();

        for (int i = 0; i < l; i++) {

            nums[i] = deque.removeLast();
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int l = removeDuplicates(nums);
        System.out.println(l);
        System.out.println("----------------------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
