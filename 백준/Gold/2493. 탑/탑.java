import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
	    String[] tokens = br.readLine().split(" ");
        int[] result = new int[T];
        int[] height = new int[T]; // 입력 받은 높이
        for (int i = 0; i < T; i++) {
            height[i] = Integer.parseInt(tokens[i]);
        }
        
        // {탑 번호, 탑 높이} 형태로 저장
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        
        for (int i = 0; i < T; i++) {
            int currentHeight = height[i];
            
            // 스택이 비어있지 않으면서(맨 왼쪽의 경우는 비어있음) 현재 높이보다 작은 경우는 다 꺼낸다.
            while (!stack.isEmpty() && stack.peek()[1] < currentHeight) {
                stack.removeFirst();
            }
            
            // 이제 현재 높이보다 큰 경우만 남았음
            // stack이 비지 않았다면
            if (!stack.isEmpty()) {
                result[i] = stack.peekFirst()[0];
            } else {
                result[i] = 0;
            }
            
            stack.offerFirst(new int[]{i+1, currentHeight});
        }
        StringBuilder sb = new StringBuilder();
        for (int n: result) {
            sb.append(n).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}