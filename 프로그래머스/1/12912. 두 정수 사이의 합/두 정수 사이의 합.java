class Solution {
    public long solution(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        long tmp=0;
        for(int i=min; i<=max; i++){
            tmp+=i;
        }
        return tmp;
    }
}