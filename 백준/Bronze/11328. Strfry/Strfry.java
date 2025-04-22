import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T = Integer.parseInt(br.readLine());
            
            StringTokenizer st;
            
            outer:
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                
                String originStr = st.nextToken();
                StringBuilder compareSb = new StringBuilder(st.nextToken());
                
                for (int j = 0; j < originStr.length(); j++) {
                    if(compareSb.length() == 0) {
                        bw.write("Impossible" + "\n");
                        continue outer;
                    }
                    for (int k = 0; k < compareSb.length(); k++) {
                        if(originStr.charAt(j) == compareSb.charAt(k)) {
                            compareSb.deleteCharAt(k);
                            break;
                        }
                    }
                }
                
                // 비교 문자열의 길이가 0이면 Possible 아니면 Impossible
                if(compareSb.length() == 0) {
                    bw.write("Possible" + "\n");
                } else {
                    bw.write("Impossible" + "\n");
                }
            }
            bw.flush();
            bw.close();
            br.close();
    }
}