import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        // 1. for문으로 divisor로 나눠지는 수를 arraylist에 add하기
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        
        // 2. 만약 divisor로 나누어 떨어지는 element가 하나도 없다면 -1담아 반환
        if(arrList.isEmpty()){
            answer = new int[]{-1};
            return answer;
        }
        
        // 3. arraylist 정렬
        Collections.sort(arrList);
        
        // 4. 정렬된 arraylist를 순서대로 answer 배열에 넣기
        int size = arrList.size();
        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}