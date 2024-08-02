class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int divCount = 0;
        for (int i = left; i <= right; i++){
            // 1. 약수의 갯수가 짝수인 경우와 홀수인 경우를 나눈다.
            if(divisor(i) % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    // 약수의 갯수 반환해주는 메서드
    public int divisor(int me){
        int count = 0;
        
        for(int i = 1; i <= me; i++){
                if(me % i == 0){
                count ++;
            }
        }
        
        return count;
    }
}