import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }

        if(result == n) {
            bw.write("P");
        } else {
            bw.write("N");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}