import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        for (int i = 1; i <= m; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            while (n != 1) {
                cnt++;
                n = calculate(n);
            }
            sb.append(String.valueOf(cnt));
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    public static int calculate(int a) {
        if (a % 2 == 1) {
            a = a * 3 + 1;
        } else {
            a = a/2;
        }
        return a;
    }
}
