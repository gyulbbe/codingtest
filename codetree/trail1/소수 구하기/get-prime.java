import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j < i; j++) {
                
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 1) {
                list.add(i);
            }
        }
        
        list.sort(Comparator.naturalOrder());

        for (int i : list) {
            sb.append(String.valueOf(i) + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
