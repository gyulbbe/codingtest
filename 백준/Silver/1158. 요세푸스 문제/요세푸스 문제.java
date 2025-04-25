import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            list.add(i);
        }
        
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        while(!list.isEmpty()) {
            i = (i + K - 1) % list.size();
            int var = list.remove(i);
            arr.add(var);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int j = 0; j < arr.size(); j++) {
            sb.append(arr.get(j));
            if(j < arr.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        bw.write(sb.toString());
		bw.flush();
        bw.close();
        br.close();
	}
}