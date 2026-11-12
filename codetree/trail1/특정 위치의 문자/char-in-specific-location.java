import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        StringBuilder sb = new StringBuilder();
        String [] arr = {"L", "E", "B", "R", "O", "S"};
        sb.append("None");
        for (int i = 0; i < 6; i++) {
            if(arr[i].equals(s)) {
                sb.setLength(0);
                sb.append(String.valueOf(i));
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}