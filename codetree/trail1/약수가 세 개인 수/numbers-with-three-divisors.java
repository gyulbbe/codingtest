import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 3) {
                sum++;
            }
        }
        
        sb.append(String.valueOf(sum));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
