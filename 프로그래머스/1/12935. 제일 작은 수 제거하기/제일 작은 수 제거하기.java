import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 처음 받은 배열 순서 지키는 용도
        ArrayList<Integer> seq = new ArrayList<>();
        for(int n : arr){
            seq.add(n);
        }
        
        // 정렬을 이용하여 가장 작은 수를 찾는 용도
        ArrayList<Integer> findMin = new ArrayList<>();
        for(int n : arr){
            findMin.add(n);
        }
        
        // 1. 배열의 길이가 1인 경우 -1반환
        if(arr.length == 1){
            int[] answer = new int[]{-1};
            return answer;
        }
        // 2. 1인 경우만 1크기의 -1반환하고 아닌 경우는 하나 줄어든 크기로 배열 생성
        int[] answer = new int[arr.length - 1];
        
        // 3. 정렬
        Collections.sort(findMin);
        
        // 4. 가장 작은 수를 가지고 순서가 그대로인 arraylist에서 삭제
        int min = findMin.get(0);
        boolean isRemoved = seq.remove(Integer.valueOf(min));
        
        // 5. arraylist에서 가장 작은 수만 빠지고 순서가 그대로인 배열seq를 seq에 그대로 복사하여 반환
        for(int i = 0; i < arr.length - 1; i++){
            answer[i] = seq.get(i);
        }
        
        return answer;
    }
}