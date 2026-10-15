import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double sum = 0;
        double avg = 0;
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt ++;
            }
        }

        // avg = ;
        avg = Math.round((sum / cnt) * 10) / 10.0;
        int resultSum = (int) sum;
        bw.write(String.valueOf(resultSum) + " " + String.valueOf(avg));
        bw.flush();
        bw.close();
        br.close();
    }
}