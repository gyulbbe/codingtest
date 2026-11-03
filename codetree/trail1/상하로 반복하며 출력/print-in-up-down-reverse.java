import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(j % 2 == 1) {
                        int num = i + 1;
                        sb.append(String.valueOf(num));
                    } else {
                        int num = n - i;
                        sb.append(String.valueOf(num));
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