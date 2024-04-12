class Solution {
    public long solution(long n) {
        long answer = -1;
        if((double)Math.sqrt(n)==(long)Math.sqrt(n)){
            long sqrtN= (long)Math.sqrt(n);
            answer = (long)Math.pow(sqrtN+1,2);
        }
        return answer;
    }
}