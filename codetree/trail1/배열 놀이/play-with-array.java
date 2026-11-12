import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            if (start == 1) {
                int num = Integer.parseInt(st.nextToken());
                sb.append(String.valueOf(arr[num - 1]));
                sb.append("\n");
            } else if (start == 2) {
                int num = Integer.parseInt(st.nextToken());
                int value = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == num) {
                        value = j + 1;
                        break;
                    }
                }
                sb.append(String.valueOf(value) + " ");
                sb.append("\n");
            } else {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                for (int j = s - 1; j <= e - 1; j++) {
                    sb.append(String.valueOf(arr[j]) + " ");
                }
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
