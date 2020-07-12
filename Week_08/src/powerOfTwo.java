/**
 * @Author MingChao Jin
 * @Date 2020/7/13 10:26
 * @Description: https://leetcode-cn.com/problems/power-of-two/solution/2de-mi-by-leetcode/
 */
public class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long x = (long) n;
        return (x & (-x)) == x;
    }
}
