import java.util.Arrays;

class Solution {
    /**
    * 문제 해석
    * 1. 문자열 s를 매개값으로 받는다.
    * 2. 문자를 큰 것부터 작은 순으로 정렬해서 리턴한다.
    */
    public String solution(String s) {
        /**
        * 의사 코드
        * 1. 주어진 문자열 s를 char 배열로 변환한다.
        * 2. Arrays.sort()를 이용해 정렬한다.
        * 3. StringBuilder를 이용해 reverse 한다.
        */
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}