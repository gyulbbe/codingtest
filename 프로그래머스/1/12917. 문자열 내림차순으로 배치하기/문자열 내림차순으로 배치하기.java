import java.util.*;

class Solution {
    public String solution(String s) {
        // 1. char[] 배열에 넣기
        char[] charArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            charArr[i] = s.charAt(i);
        }
        
        // 2. 정렬
        Arrays.sort(charArr);
        
        // 3. StringBuilder에 역순으로 집어넣기
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(charArr[i]);
        }
        
        // 4. String으로 반환
        String answer = sb.toString();
        
        return answer;
    }
}