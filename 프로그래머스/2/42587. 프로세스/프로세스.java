import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        ArrayDeque<Priority> d = new ArrayDeque<>();
        int len = priorities.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            d.offer(new Priority(priorities[i], i));
        }
        
        while (d != null && !d.isEmpty()) {
            int maxValue = d.peek().priority;
            d.offerLast(d.poll());
            // 한바퀴 돌아서 max값 구함
            for (int i = 0; i < d.size() - 1; i++) {
                maxValue = Math.max(maxValue, d.peek().priority);
                d.offerLast(d.poll());
            }
            count++;
            
            // maxValue와 같다면 앞에꺼 빼서 뒤로 넣는 거 중지 -> 뺀 거는 삭제
            // 다르다면 앞에꺼 빼서 뒤로 넣기
            for (int i = 0; i < d.size(); i++) {
                Priority next = d.poll();
                if (next.priority == maxValue) {
                    if (next.index == location) {
                        return count;
                    }
                    break;
                }
                d.offerLast(next);
            }
        }
        return count;
    }
    class Priority {
        int priority;
        int index;
        public Priority(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}