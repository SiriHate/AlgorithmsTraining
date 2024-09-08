package LeetCode.Solved.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task349 {
    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> resList = new ArrayList<>();

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (Integer num : nums1) {
            firstSet.add(num);
        }

        for (Integer num : nums2) {
            secondSet.add(num);
        }

        for (Integer num : secondSet) {
            if (firstSet.contains(num)) {
                resList.add(num);
            }
        }

        return resList.stream().mapToInt(i -> i).toArray();
    }


}
