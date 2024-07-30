class Solution {
    public int solution(long num) {
        int index = 0;
        int i = 0;
        // 주어진 수가 1인 경우
        if(num == 1)
            return 0;
        for(i = 1; i <= 500; i++){
            // 짝수인 경우
            if(num % 2 == 0){
                num = num/2;
                index++;
            } else {
                // 홀수인 경우
                num = num * 3 + 1;
                index++;
            }
            // num이 1이 되면
            if(num == 1){
                return index;
            }
        }
        // num이 1이 되지 않으면
        return -1;
    }
}