import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 1 && num % 3 == 0) {
                result += num;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}