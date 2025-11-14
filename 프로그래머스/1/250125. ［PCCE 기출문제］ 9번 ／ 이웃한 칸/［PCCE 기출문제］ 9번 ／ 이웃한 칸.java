import java.util.*;

class Solution {
    int answer = 0;
    int dx[] = {0, 0, -1, 1};
    int dy[] = {-1, 1, 0, 0};
    public int solution(String[][] board, int h, int w) {
        int max = board.length;
        for (int i = 0; i < 4; i++) {
            int nx = w + dx[i];
            int ny = h + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx <= max - 1 && ny <= max - 1 && board[ny][nx].equals(board[h][w])) {
                answer++;
            }
        }
        return answer;
    }
}