package popularInterviewQuestions.integers;



public class SingleNumber {

    // TC: O(n) SC: O(1)
    public int singleNumber(int[] nums) {
        int answer = nums[0];
        for(int i = 1; i < nums.length; i++) {
            answer = answer ^ nums[i];
        }
        return answer;
    }

}
