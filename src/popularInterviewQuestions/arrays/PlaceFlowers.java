package popularInterviewQuestions.arrays;

public class PlaceFlowers {

    // TC: O(n^2) SC: O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                int left = i;
                while(left >= 0 && flowerbed[left] == 0) {
                    left--;
                }
                int right = i;
                while(right < flowerbed.length && flowerbed[right] == 0) {
                    right++;
                }
                if((left < 0 || i - left >= 2) && (right >= flowerbed.length || right - i >= 2)) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }

    // optimized solution
    // TC: O(n) SC: O(1)
    public boolean optimizedPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean emptyLeftPlot = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
                if(emptyLeftPlot && emptyRightPlot) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }

}
