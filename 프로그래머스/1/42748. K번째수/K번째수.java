import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int outLen = commands.length;
        int[] answer = new int[outLen];
        for (int i = 0; i < outLen; i++) {
            // 1. commands를 나눈다.
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int index = commands[i][2] - 1;
            
            // 2. 잘라서 새로운 배열 생성
            int inLen = end - start + 1;
            int[] arrayDiv = new int[inLen];
            for (int j = 0; j < inLen; j++) {
                arrayDiv[j] = array[j + start];
            }
            
            // 3. 새로운 배열 정렬
            Arrays.sort(arrayDiv);
            
            // 4. 반환할 배열에 넣는다.
            answer[i] = arrayDiv[index];
        }
        return answer;
    }
}