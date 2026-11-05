import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j -= 2) {
                sb.append(String.valueOf(j));
                sb.append(" * ");
                sb.append(String.valueOf(i));
                sb.append(" = ");
                int result = i * j;
                sb.append(String.valueOf(result));
                if (j == a) continue;
                sb.append(" / ");
            }
            sb = new StringBuilder(sb.toString().trim());
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
