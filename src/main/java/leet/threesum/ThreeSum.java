package leet.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new LinkedList<>();

        // [-4, -1, -1, 0, 1, 2]
        for (int current = 0; current < nums.length - 2; current++) {
            if (current == 0 || nums[current] != nums[current - 1]) {
                int target = -nums[current];
                int start = current + 1;
                int end = nums.length - 1;

                while (start < end) {
                    int twoSum = nums[start] + nums[end];
                    if (twoSum > target) {
                        end--;
                    } else if (twoSum < target) {
                        start++;
                    } else {
                        triplets.add(List.of(nums[current], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) start++;
                        while (start < end && nums[end] == nums[end - 1]) end--;
                        start++;
                        end--;
                    }
                }
            }
        }

        return triplets;
    }
}
