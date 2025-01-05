import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }
        
        // 가장 작은 수가 K보다 작으면 섞기
        while(pq.size() > 1 && pq.peek() < K) {
            answer++;
            int mix = pq.poll() + pq.poll() * 2;
            pq.offer(mix);
        }
        
        // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
        if (pq.size() < 2 && pq.peek() < K) {
            return -1;
        }
        return answer;
    }
}