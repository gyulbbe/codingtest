import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = n - i - 1; j < n; j++) {
                sb.append("*");
            }
            sb.append("\n\n");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                sb.append("*");
            }
            sb.append("\n\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}