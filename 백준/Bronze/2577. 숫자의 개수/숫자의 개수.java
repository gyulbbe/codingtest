import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int total = a * b * c;
        String stringTotal = String.valueOf(total);
        int len = stringTotal.length();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = 0; j < len; j++) {
                if(stringTotal.charAt(j) == Character.forDigit(i, 10)) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
		bw.flush();
        bw.close();
        br.close();
	}
}