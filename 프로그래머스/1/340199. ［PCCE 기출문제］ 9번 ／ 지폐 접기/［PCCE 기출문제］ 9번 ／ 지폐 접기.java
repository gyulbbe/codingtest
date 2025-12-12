import java.util.*;

class Solution {
    private int walletSmall;
    private int walletBig;
    private int billSmall;
    private int billBig;
    private int tmp;
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        walletSmall = Math.min(wallet[0], wallet[1]);
        walletBig = Math.max(wallet[0], wallet[1]);
        billSmall = Math.min(bill[0], bill[1]);
        billBig = Math.max(bill[0], bill[1]);
        while(!((walletBig >= billBig) && (walletSmall >= billSmall))) {
            tmp = billBig / 2;
            billBig = Math.max(tmp, billSmall);
            billSmall = Math.min(tmp, billSmall);
            answer++;
        }
        return answer;
    }
}