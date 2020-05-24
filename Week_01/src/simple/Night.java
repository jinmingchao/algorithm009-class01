package simple;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 21:57
 * @Description: https://leetcode-cn.com/problems/plus-one/
 */
public class Night {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
