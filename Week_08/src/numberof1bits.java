/**
 * @Author MingChao Jin
 * @Date 2020/7/13 10:24
 * @Description: https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class numberof1bits {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

}
