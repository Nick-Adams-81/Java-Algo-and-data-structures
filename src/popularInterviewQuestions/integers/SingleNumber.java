package popularInterviewQuestions.integers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // brute force method TC: O(n) SC:O(n)

    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) {
                numbers.remove(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }
        return numbers.iterator().next();
    }

    // constant space complexity TC: O(n) SC: O(1)

    public int advancedSingleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }






}
