class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;
        // 1. 수포자가 찍는 방식 배열 생성
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 2. 찍은 답안지와 진짜 답지와 비교
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for (int i = 0; i < len; i++){
            if (arr1[i%5] == answers[i])
                count1++;
        }
        for (int i = 0; i < len; i++){
            if (arr2[i%8] == answers[i])
                count2++;
        }
        for (int i = 0; i < len; i++){
            if (arr3[i%10] == answers[i])
                count3++;
        }
        
        // 3. answer에 점수 높은 사람 넣기
        int[] answer = {};
        int max = Math.max(count1, Math.max(count2, count3));
        if (max == count1){
        answer = new int[]{1};
        }
        if (max == count2){
            answer = new int[]{2};
        }
        if (max == count3){
            answer = new int[]{3};
        }
        if (count1 == count2 && count2 == count3){
            answer = new int[]{1,2,3};
        }
        if (count1 == count2 && count2 > count3) {
            answer = new int[]{1,2};
        }
        if (count2 == count3 && count3 > count1) {
            answer = new int[]{2,3};
        }
        if (count3 == count1 && count1 > count2) {
            answer = new int[]{1,3};
        }
        
        return answer;
    }
}