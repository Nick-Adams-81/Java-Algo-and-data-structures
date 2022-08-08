package popularInterviewQuestions.arrays;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
           int diff = target - nums[i];
           if(map.containsKey(diff)) {
               answer[0] = i;
               answer[1] = map.get(diff);
           } else {
               map.put(nums[i], i);
           }
        }

        return answer;
    }
}
