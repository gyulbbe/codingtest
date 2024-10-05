import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        // 1. map<의상 종류, 갯수> 생성
        for (String[] c : clothes) {
            map.compute(c[1], (k, v) -> v == null ? 1 : v + 1);
        }
        /*
        // 기본 의상 갯수 + 조합으로 나눴음
        // 2. 기본 의상 갯수
        int plus = 0;
        for (String k : map.keySet()) {
            plus += map.get(k);
        }
        answer += plus;
        */
        // 3. 2개 이상일 때, 조합 갯수
        
            int multiply = 1;
            for (String k : map.keySet()) {
                multiply *= map.get(k) + 1;
            }
            answer += (multiply - 1);
        
        
        return answer;
    }
}