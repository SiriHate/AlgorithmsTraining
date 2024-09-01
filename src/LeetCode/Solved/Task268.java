package LeetCode.Solved;

import java.util.HashSet;
import java.util.Set;

public class Task268 {
    public int missingNumber(int[] nums) {

        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            set.add(num);
        }

        for (int i = 0; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }
}
