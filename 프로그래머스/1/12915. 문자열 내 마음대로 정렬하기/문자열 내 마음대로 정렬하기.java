import java.util.*;

class Solution {
    /**
    * 문제 해석
    * 1. 문자열 배열 strings와 정수 n이 주어짐
    * 2. 각 요소의 n번째에 있는 문자를 기준으로 요소들을 오름차순 정렬
    */
    public String[] solution(String[] strings, int n) {
        /**
        * 문제 풀이
        * 1. Comparator를 오버라이드 하여 원하는 순으로 정렬하는 비교 메소드 활용
        */
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자열 비교
                if (s1.charAt(n) != s2.charAt(n)) {
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
                
                // n번째 문자가 같으면 사전순으로 비교
                return s1.compareTo(s2);
            } 
        });
        
        return strings;
    }
}