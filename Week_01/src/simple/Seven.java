package simple;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 21:55
 * @Description: TODO
 */
public class Seven {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for(int j = 0;j < nums.length;j++){
                if(nums[i] + nums[j] == target && i!= j){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No pair can be found!");
    }

}
