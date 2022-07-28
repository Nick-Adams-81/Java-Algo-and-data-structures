package popularInterviewQuestions.singleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // brute force method TC: O(n) SC:O(n)
    public int singleNumber(int[] array) {
        if(array.length == 1) return array[0];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
            if(set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }
        return set.iterator().next();

    }

    // constant space complexity TC: O(n) SC: O(1)
    public int advancedSingleNumber(int[] array) {
        int num = array[0];
        for(int i = 1; i < array.length; i++) {
            num = num ^ array[i];
        }
        return num;
    }





}
