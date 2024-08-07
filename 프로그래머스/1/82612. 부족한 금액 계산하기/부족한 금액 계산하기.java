class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        while(count > 0){
            total += price * count;
            count--;
        }
        
        answer = money - total;
        if(answer < 0){
            return -answer;
        }
        
        return 0;
    }
}