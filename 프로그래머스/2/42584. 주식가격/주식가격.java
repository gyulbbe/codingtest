import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        // 1. Price 클래스 배열 생성
        Price[] priceArray = new Price[len];
        for (int i = 0; i < len; i++) {
            priceArray[i] = new Price(prices[i]);
        }
        
        // 2. index의 price보다 커지면 멈춘다.
        // 비교할 때마다 gap++
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                priceArray[i].gap++;
                if (priceArray[i].price > priceArray[j].price) {
                    break;
                }
            }
        }
        
        // 3. 결과 담기
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = priceArray[i].gap;
        }
        
        return answer;
    }
    class Price {
        int price;
        int gap = 0;
        public Price(int price) {
            this.price = price;
        }
    }
}