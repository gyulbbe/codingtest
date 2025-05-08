import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch(command) {
                case "push": 
                    int number = Integer.parseInt(st.nextToken());
                    q.addLast(number);
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.removeFirst() + "\n");
                    }
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.getLast() + "\n");
                    }
                    break;
            }
        }
        
		bw.flush();
        bw.close();
        br.close();
	}
}