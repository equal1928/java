package leetcode;

public class isPowerofTwo {
    public boolean isPowerOfTwo(int n) {
        int current_value = 1;

        while (n > current_value){
            current_value *= 2;
        }

        return n == current_value;
    }
}
