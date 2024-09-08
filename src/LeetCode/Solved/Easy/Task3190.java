package LeetCode.Solved.Easy;

public class Task3190 {
    public static int minimumOperations(int[] nums) {

        int totalOperationCounter = 0;

        for (int num : nums) {
            if ((num + 1) % 3 == 0 || ((num - 1) % 3 == 0)) {
                totalOperationCounter += 1;
            } else {
                if (!(num % 3 == 0)) {
                    totalOperationCounter += 2;
                }
            }
        }

        return totalOperationCounter;
    }
}
