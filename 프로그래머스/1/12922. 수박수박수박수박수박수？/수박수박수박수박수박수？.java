class Solution {
    /**
    * 문제 해석
    * 길이가 n이고 패턴이 "수박수박수박수..."인 문자열 리턴
    */
    public String solution(int n) {
        /**
        * 의사 코드
        * 1. 짝수면 n / 2 만큼 "수박" 반복해서 붙이기
        * 2. 홀수면 n / 2 만큼 "수박"을 붙이고 마지막에 "수" 붙이기
        */
        String answer = "";
        
        if (n == 1) return "수";
        
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer += "수박";
            }
            return answer;
        } else {
            for (int i = 0; i < n / 2; i++) {
                answer += "수박";
            }
            answer += "수";
            return answer;
        }
    }
}