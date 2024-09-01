package LeetCode.Solved;

public class Task3151 {
    public static boolean isArraySpecial(int[] nums) {

        if (nums.length <= 1) {
            return true;
        }

        boolean isCurrentNumEven = nums[0] % 2 == 0;

        for (int i = 0; i < nums.length - 1; i++) {
            boolean isNextNumEven = nums[i + 1] % 2 == 0;
            {
                if ((isCurrentNumEven && isNextNumEven) || (!isCurrentNumEven && !isNextNumEven)) {
                    return false;
                }
            }
            isCurrentNumEven = isNextNumEven;
        }

        return true;
    }
}
