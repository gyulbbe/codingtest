import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // Please write your code here.
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int big = Math.max(a,b);
        int small = Math.min(a,b);


        int result = 0;
        for(int i = small; i <= big; i++) {
            if (i % 5 ==0) {
                result += i;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}