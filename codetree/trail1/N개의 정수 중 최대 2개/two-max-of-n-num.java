import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.reverseOrder());
        sb.append(list.get(0) + " " + list.get(1));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}