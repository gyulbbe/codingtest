class Solution {
    public String solution(int n) {
        char a = '수';
        char b = '박';
        String answer = "";
        // 1. n이 홀수인 경우와 짝수인 경우를 나누기
        if (n % 2 == 1){
            // 2. 홀수인 경우는 길이를 2로 나눈 숫자만큼 a+b를 하고 마지막(for문 밖에서)에 a를 더한다
            for(int i = 0; i < n/2; i++){
                answer += a;
                answer += b;
            }
            answer += a;
        } else {
            // 3. 짝수인 경우 길이를 2로 나눈 숫자만큼 a+b를 한다.
            for(int i = 0; i < n/2; i++){
                answer += a;
                answer += b;
            }
        }
        
        return answer;
    }
}