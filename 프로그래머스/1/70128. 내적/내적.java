class Solution {
    /**
    * 문제 해석
    * 길이가 같은 1차원 int 배열 a, b가 주어짐
    * a와 b의 내적을 구하라
    * 내적 공식: a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
    */
    public int solution(int[] a, int[] b) {
        /**
        * 의사 코드
        * 1. 배열의 길이만큼 순회
        * 2. a[i] * b[i] 한 값을 result에 반복 저장
        */
        int result = 0;
        
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        
        return result;
    }
}