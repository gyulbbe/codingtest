import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();
		int T = Integer.parseInt(br.readLine());
        ArrayDeque<Character> left = new ArrayDeque<>();
        ArrayDeque<Character> right = new ArrayDeque<>();
        for(char c : arr) {
            left.addLast(c);
        }
        
        for(int i = 0; i < T; i++) {
            String cmd = br.readLine();
            switch(cmd.charAt(0)) {
                case 'L':
                    if(!left.isEmpty()){
                        // 커서 왼쪽 마지막을 커서 오른쪽 첫번째로 이동
                        char leftLast = left.removeLast();
                        right.addFirst(leftLast);
                    }
                    break;
                case 'D':
                    if(!right.isEmpty()) {
                        // 커서 오른쪽 첫번째를 커서 왼쪽 마지막으로 이동
                        char rightFirst = right.removeFirst();
                        left.addLast(rightFirst);
                    }
                    break;
                case 'B':
                    if(!left.isEmpty()){
                        // 커서 왼쪽 마지막 삭제
                        left.removeLast();
                    }
                    break;
                case 'P':
                    // 커서 왼쪽에 마지막에 문자 추가
                    left.addLast(cmd.charAt(2));
                    break;
            }
        }
        
        char[] leftCharArr = new char[left.size()];
        int i = 0;
        while(!left.isEmpty()) {
            leftCharArr[i++] = left.removeFirst();
        }
        char[] rightCharArr = new char[right.size()];
        int j = 0;
        while(!right.isEmpty()) {
            rightCharArr[j++] = right.removeFirst();
        }
        String leftStr = String.valueOf(leftCharArr);
        String rightStr = String.valueOf(rightCharArr);
        
        bw.write(leftStr + rightStr);
		bw.flush();
        bw.close();
        br.close();
	}
}