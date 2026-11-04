import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(String.valueOf(i));
                sb.append(" * ");
                sb.append(String.valueOf(j));
                sb.append(" = ");
                int result = i * j;
                sb.append(String.valueOf(result));
                if(j == n) continue;
                sb.append(", ");
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
