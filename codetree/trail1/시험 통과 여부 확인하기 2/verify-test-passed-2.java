import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if(sum / 4 >= 60) {
                sb.append("pass");
                cnt++;
            } else {
                sb.append("fail");
            }
            sb.append("\n");
        }
        sb.append(String.valueOf(cnt));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}