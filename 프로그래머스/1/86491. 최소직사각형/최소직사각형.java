import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        // 1. 큰 수가 무조건 sizes[i][0]에 오도록 정렬
        for(int i = 0; i < len; i++) {
            Arrays.sort(sizes[i]);
        }
        
        // 2. 가로에서 가장 큰 수와 세로에서 가장 큰 수를 구한다.
        int wMax = 0;
        int hMax = 0;
        for(int i = 0; i < len; i++) {
            wMax = Math.max(wMax, sizes[i][0]);
            hMax = Math.max(hMax, sizes[i][1]);
        }
        
        return wMax * hMax;
    }
}