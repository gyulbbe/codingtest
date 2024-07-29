import java.util.Arrays;

class Solution {
    public long solution(long n) {
        int index = 0;
        long temp = 0;
        temp = n;
        //1. n의 길이를 알아내 자릿수에 맞는 배열 생성
        while(temp != 0){
            temp = temp/10;
            index++;
        }
        long[] nArr = new long[index];
        //2. /와 %연산자를 이용해서 각자리에 알맞게(하나씩) 넣기
        long element = n;
        for(int i = 0; i < index; i++){
            nArr[i] = element%10;
            element = element/10;
        }
        //3. sort로 정렬
        Arrays.sort(nArr);
        //4. 다시 10을 곱해가며 숫자형으로 변환
        long result = 0;
        for(int i = 0; i < index; i++){
            result += nArr[i] * Math.pow(10, i);
        }
        
        return result;
    }
}