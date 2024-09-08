package LeetCode.Solved.Easy;

public class Task2974 {
    public static int[] numberGame(int[] nums) {

        int[] res = new int[nums.length];

        int counter = 0;

        for (int i = 0; i < nums.length / 2; i++) {

            // Alice
            int minNumIndex = findMin(nums);
            int aliceNum = nums[minNumIndex];
            nums[minNumIndex] = 0;

            // Alice
            minNumIndex = findMin(nums);
            int bobNum = nums[minNumIndex];
            nums[minNumIndex] = 0;

            res[counter] = bobNum;
            counter++;
            res[counter] = aliceNum;
            counter++;
        }

        return res;
    }

    public static int findMin(int[] nums) {

        int minNumIndex = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min && nums[i] != 0) {
                min = nums[i];
                minNumIndex = i;
            }
        }

        return minNumIndex;
    }
}
