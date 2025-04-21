import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
        String stringT = T + ""; // String형태로 변환
        int[] arr = new int[10];
        int len = stringT.length();
        for (int i = 0; i < len; i++) {
            int digit = stringT.charAt(i) - '0';
            arr[digit]++;
        }
        
        int count = 0;
        for(int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) {
                int sixAndNine = (arr[6] + arr[9] + 1) / 2;
                count = Math.max(count, sixAndNine);
            } else {
                count = Math.max(count, arr[i]);
            }
        }
        
        bw.write(count + "");
		bw.flush();
        bw.close();
        br.close();
	}
}