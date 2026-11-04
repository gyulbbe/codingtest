import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    num += 2;
                    sb.append(String.valueOf(num) + " ");
                }
            } else {
                for (int j = n; j > 0; j--) {
                    num++;
                    sb.append(String.valueOf(num) + " ");
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
