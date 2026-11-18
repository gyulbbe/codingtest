import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int [] nArr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        int [] mArr = new int[m];
        st = new StringTokenizer(br.readLine());
        StringBuilder mSb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
            mSb.append(mArr[i] + " ");
        }

        String result = "No";
        
        for (int i = 0; i <= n - m; i++) {
            StringBuilder nSb = new StringBuilder();
            for (int j = i; j < n; j++) {
                nSb.append(nArr[j] + " ");
                // System.out.println("nArr[j] : " + nArr[j]);
                // System.out.println("nSb : " + nSb);
                // System.out.println("mSb : " + mSb);
                if (nSb.toString().equals(mSb.toString())) {
                    // System.out.println("Yes nSb.toString() : " + nSb.toString());
                    result = "Yes";
                    break;
                }
            }
            // System.out.println("Yes mSb.toString() : " + mSb.toString());
            // System.out.println("========================================");
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}