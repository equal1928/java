package leetcode;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    int[] result = { i, j };
                    return result;
                }

            }
        }
        return new int[1];
    }
}
