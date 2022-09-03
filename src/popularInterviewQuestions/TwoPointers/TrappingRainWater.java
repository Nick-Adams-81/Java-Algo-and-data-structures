package popularInterviewQuestions.TwoPointers;

public class TrappingRainWater {

    public int trappingRainWater(int[] height) {
        int i = 0, j = height.length -1, maxLeft = 0, maxRight = 0, water = 0;
        while(i < j) {
            if(height[i] <= height[j]) {
                maxLeft = Math.max(maxLeft, height[i]);
                water += maxLeft - height[i];
                i++;
            } else {
                maxRight = Math.max(maxRight, height[j]);
                water += maxRight - height[j];
                j--;
            }
        }
        return water;
    }

//    public int trappingRainWater(int[] height) {
//        int max = 0, n = height.length;
//        for(int i = 0; i < n; i++) {
//            if(height[max] < height[i]) {
//                max = i;
//            }
//        }
//        int sum = 0;
//        int leftMax = 0;
//        for(int i = 0; i < max; i++) {
//            if(height[leftMax] < height[i]) {
//                leftMax = i;
//            }
//            sum += Math.min(height[leftMax], height[max]) - height[i];
//        }
//        int rightMax = n - 1;
//        for(int i = n - 1; i > max; i--) {
//            if(height[rightMax] < height[i]) {
//                rightMax = i;
//            }
//            sum += Math.min(height[max], height[rightMax]) - height[i];
//        }
//        return sum;
//    }
}
