import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String result = "P";
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                result = "C";
            }
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}