import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int w = (brown - 4) / 2; // 너비
        int h = 0; // 높이
        int len = (brown - 4) / 4;
        for (int i = 1; i <= len; i++) {
            if (w * h == yellow) {
                break;
            }
            w--;
            h++;
        }
        int[] answer = new int[]{w + 2, h + 2};
        return answer;
    }
}