import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 1. for문으로 자신을 제외한 수를 더하기
        // 그 수를 hashset에 집어넣기
        HashSet<Integer> set = new HashSet<>();
        int len = numbers.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // 2. 반환할 배열에 집어넣기
        Integer[] tmp = set.toArray(new Integer[0]);
        len = tmp.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = tmp[i];
        }
        
        // 3. 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}