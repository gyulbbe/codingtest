import java.util.*;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int len = numbers.length;
        int maxVal = Integer.parseInt(numbers[0]);
        int minVal = Integer.parseInt(numbers[0]);
        for(int i = 1; i < len; i++) {
            maxVal = Math.max(maxVal, Integer.parseInt(numbers[i]));
            minVal = Math.min(minVal, Integer.parseInt(numbers[i]));
        }
        return minVal + " " + maxVal;
    }
}