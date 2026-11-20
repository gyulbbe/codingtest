import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            arr[num]++;
        }
        list.sort(Comparator.reverseOrder());
        int result = -1;
        for(int i : list) {
            // System.out.println("i : " + i);
            // System.out.println("arr[i] : " + arr[i]);
            // System.out.println("==============================");
            if(arr[i] == 1) {
                result = i;
                break;
            }
        }
        sb.append(String.valueOf(result));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}