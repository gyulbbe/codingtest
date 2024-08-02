class Solution {
    public String solution(String s) {
        String answer = "";
        // s가 짝수인 경우와 홀수인 경우를 나누기
        // 홀수인 경우는 /2 짝수인 경우는 /2-1 과 /2의 합
        // 형변환
        int length = s.length();
        if(length % 2 == 1){
            char middle = s.charAt(length/2);
            answer = String.valueOf(middle);
        } else {
            char middle1 = s.charAt(length/2 - 1);
            char middle2 = s.charAt(length/2);
            answer = String.valueOf(middle1) + String.valueOf(middle2);
        }
        
        return answer;
    }
}