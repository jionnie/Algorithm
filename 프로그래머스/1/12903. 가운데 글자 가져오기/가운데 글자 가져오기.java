class Solution {
    /*
    문제 해석
    1. 주어진 문자열 s의 가운데 글자를 반환한다.
    2. 단, 문자열 길이가 짝수라면 가운데 두글자를 반환한다.
    */
    public String solution(String s) {
        /*
        의사 코드
        1. 문자열의 길이가 홀수면 substring으로 (문자열 길이/2) 위치의 문자열 추출
        2. 문자열의 길이가 짝수면 substring으로 (문자열/2 - 1) 인덱스 부터 다음 인덱스까지 문자열 추출
        */
        int len = s.length();
        
        if (len % 2 == 0) {
            return s.substring((len/2 - 1), (len/2 + 1));
        } else {
            return s.substring(len/2, (len/2 + 1));
        }
    }
}