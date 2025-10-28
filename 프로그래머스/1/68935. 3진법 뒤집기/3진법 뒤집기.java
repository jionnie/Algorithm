import java.util.*;

class Solution {
    /**
    * 문제 해석
    * 1. 매개값으로 주어진 n(n은 10진법)을 3진법 상에서 앞뒤로 뒤집는다.
    * 2. 이를 다시 10진법으로 변환한 수를 리턴한다.
    */
    public int solution(int n) {
        /**
        * 문제 풀이
        * 1. 10진법으로 주어진 n을 3으로 나누는데, 몫이 0이 될 때까지 나누면서 나머지를 char 배열에 저장한다.
        * 2. 다시 10진법으로 변환한다.
        */
        String ternary = "";
        int answer = 0;
        
        while (n > 0) {
            ternary += (n % 3);
            n /= 3;
        }
        
        char[] reverse = ternary.toCharArray();
        
        for (int i = 0; i < reverse.length; i++) {
            answer += (reverse[i] - 48) * (int) Math.pow(3, reverse.length - 1 - i);
        }
        
        return answer;
    }
}