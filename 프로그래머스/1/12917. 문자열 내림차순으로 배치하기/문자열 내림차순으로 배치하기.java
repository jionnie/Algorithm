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
        * 2. lower와 upper에 각각 소문자와 대문자를 분리해서 String에 저장한다.
        * 3. 각각을 다시 char 배열로 변환 후 정렬한다.
        * 4. lower와 upper를 합친다.
        */
        char[] arr = s.toCharArray();
        
        String lower = "";
        String upper = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                upper += arr[i];
            } else {
                lower += arr[i];
            }
        }
        
        char[] upperArr = upper.toCharArray();
        char[] lowerArr = lower.toCharArray();
        upper = "";
        lower = "";
        
        Arrays.sort(upperArr);
        Arrays.sort(lowerArr);
        
        for (int i = upperArr.length - 1; i >= 0; i--) {
            upper += upperArr[i];
        }
        
        for (int i = lowerArr.length - 1; i >= 0; i--) {
            lower += lowerArr[i];
        }
        
        return lower + upper;
    }
}