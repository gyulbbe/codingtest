import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
		int T = Integer.parseInt(br.readLine());
        int cursor = sb.length();
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            if(str.charAt(0) == 'L') {
                if(cursor == 0 || sb.length() == 0) {
                    continue;
                }
                cursor--;
            } else if(str.charAt(0) == 'D') {
                if(cursor == sb.length() || sb.length() == 0) {
                    continue;
                }
                cursor++;
            } else if(str.charAt(0) == 'B') {
                if(cursor == 0 || sb.length() == 0) {
                    continue;
                }
                sb.deleteCharAt(cursor - 1);
                cursor--;
            } else if(str.charAt(0) == 'P') {
                sb.insert(cursor, str.charAt(2));
                cursor++;
            }
        }
        bw.write(sb.toString());
		bw.flush();
        bw.close();
        br.close();
	}
}