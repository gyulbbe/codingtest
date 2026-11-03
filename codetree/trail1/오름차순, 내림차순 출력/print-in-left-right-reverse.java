import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                int num = 1;
                for (int j = 1; j <= n; j++) {
                    sb.append(String.valueOf(num));
                    num++;
                    
            }
            } else {
                int num = n;
                for (int j = 1; j <= n; j++) {
                    sb.append(String.valueOf(num));
                    num--;
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