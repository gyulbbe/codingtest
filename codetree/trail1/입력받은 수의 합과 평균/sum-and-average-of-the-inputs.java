import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        double avg = 0;
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            cnt ++;
        }

        avg = Math.round((sum / cnt) * 10) / 10.0;

        bw.write((int)sum + " " + avg);
        bw.flush();
        bw.close();
        br.close();
    }
}