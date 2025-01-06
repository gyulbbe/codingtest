import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> ascPq = new PriorityQueue<>();
        PriorityQueue<Integer> descPq = new PriorityQueue<>(Collections.reverseOrder());
        for (String operation : operations) {
            if (operation.startsWith("I")) {
                ascPq.offer(Integer.parseInt(operation.substring(2)));
                descPq.offer(Integer.parseInt(operation.substring(2)));
            } else if (operation.equals("D 1") && !ascPq.isEmpty()) {
                ascPq.remove(descPq.poll());
            } else if (operation.equals("D -1") && !ascPq.isEmpty()) {
                descPq.remove(ascPq.poll());
            }
        }
        
        if (ascPq.isEmpty()) {
            return new int[] {0, 0};
        }
        
        return new int[] {descPq.poll(), ascPq.poll()};
    }
}