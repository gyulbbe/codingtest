import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st;

        double sum = 0;
        double avg = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            if (n >= 0 && n <= 200) {
                sum += n;
                cnt ++;
            }
        }

        int intSum = 0;
        avg = Math.round((sum / cnt) * 10) / 10.0;
        intSum = (int)sum;

        // if (cnt == 0) {            
        //     bw.write("0 -nan");
        // } else {
            bw.write(intSum + " " + avg);
        // }
        bw.flush();
        bw.close();
        br.close();
    }
}