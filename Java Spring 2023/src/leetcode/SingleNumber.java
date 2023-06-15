package leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor_sum = 0;
        for (int num : nums) {
            xor_sum ^= num;
        }
        return xor_sum;
    }
}
