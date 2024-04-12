class Solution {
    public boolean solution(int x) {
        String sx = String.valueOf(x);
        int a =0;
        for(int i=0; i<sx.length(); i++){
            int tmp = sx.charAt(i) - '0';
            a+=tmp;
        }
        if(x%a==0){
            return true;
        } return false;
    }
}