import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        ArrayDeque<Integer> deque1 = new ArrayDeque<>(); // 정방향 탐색
        ArrayDeque<Integer> deque2 = new ArrayDeque<>(); // 역방향 탐색
        // 세팅
        for (int i = 1; i <= N ; i++) {
            deque1.addLast(i);
            deque2.addLast(i);
        }

        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < M ; i++) {
            int target = Integer.parseInt(st.nextToken());
            targetList.add(target);
        }

        int count = 0;
        while(!targetList.isEmpty()) {
            int target = targetList.remove(0);
            for (int i = 0; i < deque1.size(); i++) {
                int deque1FristElement = deque1.removeFirst();
                int deque2FristElement = deque2.removeFirst();
                if (target == deque1FristElement) {
                    deque2.clear();
                    deque2.addAll(deque1);
                    break;
                } else if (target == deque2FristElement) {
                    deque1.clear();
                    deque1.addAll(deque2);
                    break;
                } else {
                    count++;
                    deque1.addLast(deque1FristElement);
                    deque2.addFirst(deque2FristElement);
                    int deque2LastElement = deque2.removeLast();
                    deque2.addFirst(deque2LastElement);
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
	}
}