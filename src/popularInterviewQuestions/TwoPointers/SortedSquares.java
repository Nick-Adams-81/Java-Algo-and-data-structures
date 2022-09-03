package popularInterviewQuestions.TwoPointers;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] output = new int[size];
        int current = size -1;
        int pointer1 = 0;
        int pointer2 = nums.length -1;
        while(pointer1 <= pointer2) {
            int tempLeft = nums[pointer1] * nums[pointer1];
            int tempRight = nums[pointer2] * nums[pointer2];
            if(tempLeft > tempRight) {
                output[current] = tempLeft;
                current--;
                pointer1++;
            } else {
                output[current] = tempRight;
                current--;
                pointer2--;
            }
        }
        return output;
    }
}
