package leet.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int need = target - num;
            Integer needIndex = numToIndex.get(need);

            if (needIndex != null) {
                return new int[] {needIndex, i};
            }

            numToIndex.putIfAbsent(num, i);
        }

        throw new IllegalArgumentException(
            String.format(
                "no combination of %s adds up to %s",
                Arrays.toString(nums),
                target
            )
        );
    }
}
