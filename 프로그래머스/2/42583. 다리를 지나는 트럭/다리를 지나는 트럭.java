import java.util.*;

class Solution {
    public int solution(int bridge_length, int total_weight, int[] truck_weights) {
        ArrayDeque<Truck> truckWeights = new ArrayDeque<>(); // 트럭 무게들
        int answer = 1; // 경과시간
        // 트럭 무게들을 deque로 관리
        for (int truckWeight : truck_weights) {
            truckWeights.offer(new Truck(truckWeight));
        }
        
        ArrayDeque<Truck> trucksOnBridge = new ArrayDeque<>();
        trucksOnBridge.offer(truckWeights.poll());
        // deque는 다리를 건너고 있는 트럭 <- deque이 비면 끝난 것
        while(trucksOnBridge != null && !trucksOnBridge.isEmpty()) {
            answer++;
            Truck truck = trucksOnBridge.peek();
                        
            // 다리를 건너는 트럭들 거리 추가
            for (Truck t : trucksOnBridge) {
                   t.distance++;
            }
            
            // 다리를 다 건너면 poll
            if (trucksOnBridge.peek().distance == bridge_length) {
                trucksOnBridge.poll();
            }
            
            // 다리를 건너는 트럭의 무게와 첫 번째 대기 트럭의 합이 totalWeight를 넘지 않는다면 deque에 추가
            int totalWeightTrucksOnBridge = 0; // 다리위에 있는 트럭들의 무게
            for (Truck t : trucksOnBridge) {
                totalWeightTrucksOnBridge += t.weight;
            }
            if (!truckWeights.isEmpty() && totalWeightTrucksOnBridge + truckWeights.peek().weight <= total_weight) {
                trucksOnBridge.offer(truckWeights.poll());
            }
        }
        return answer;
    }
    class Truck {
        int weight;
        int distance;
        public Truck(int weight) {
            this.weight = weight;
        }
    }
}
// 다리를 건너는 트럭들 거리 추가 부분과 다리를 다 건너면 poll 부분이 순서가 바뀌었었음