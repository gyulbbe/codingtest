import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2*n; i++) {
            if(i % 2 == 1) {
                for (int j = n - (i/2); j <= n; j++) {
                    sb.append("* ");
                }
            } else {
                for (int j = (i/2) - 1; j < n; j++) {
                    sb.append("* ");
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