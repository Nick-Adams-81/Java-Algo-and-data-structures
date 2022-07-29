package popularInterviewQuestions.integers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // brute force method TC: O(n) SC:O(n)

    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }


    // constant space complexity TC: O(n) SC: O(1)

    public int advancedSingleNum(int[] nums) {
        int answer = nums[0];
        for(int i = 1; i < nums.length; i++) {
            answer = answer ^ nums[i];
        }
        return answer;
    }






}
