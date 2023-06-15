package leetcode;

public class missed_number {
    public int missingNumber(int[] nums) {
        int sum_range = 0;
        int sum_org = 0;
        for(int i = 0; i <= nums.length; i++){
            sum_range += i;
            if (i != nums.length) {
                sum_org += nums[i];
            }
        }

        return sum_range - sum_org;
    }
}
