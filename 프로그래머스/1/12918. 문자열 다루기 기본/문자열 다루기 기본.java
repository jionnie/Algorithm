class Solution {
    /**
    * 문제 해석
    * 1. 주어진 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성되어있는지 확인하는 메소드
    */
    public boolean solution(String s) {
        /**
        * 의사 코드
        * 1. char 배열로 변환
        * 2. 문자열의 길이 확인
        * 3. 아스키 코드 값이 48~57 사이인지 검증
        */
        
        char[] arr = s.toCharArray();
        
        if (arr.length == 4 || arr.length == 6) {
            for (char c : arr) {
                if (c < 48 || c > 57) {
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
}