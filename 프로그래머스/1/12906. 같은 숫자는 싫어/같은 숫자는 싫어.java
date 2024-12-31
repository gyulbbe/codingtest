import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addLast(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                continue;
            }
            d.addLast(arr[i]);
        }
        
        return d.stream().mapToInt(Integer::intValue).toArray();
    }
}