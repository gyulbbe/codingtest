import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // Please write your code here.
        int result = 0;
        for (int i = n; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }
}