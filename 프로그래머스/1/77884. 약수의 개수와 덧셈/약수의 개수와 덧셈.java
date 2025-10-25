class Solution {
    /**
    * 문제 해석
    * 두 정수 left, right가 매개변수로 주어진다.
    * left~right 사이의 숫자 중 약수의 개수가 짝수인 수는 더하고,
    * 약수의 개수가 홀수인 수는 뺀 수를 리턴
    */
    public int solution(int left, int right) {
        /**
        * 의사 코드
        * 1. for 문을 left부터 right까지 반복
        * 2. i를 이중 for 문으로 1부터 i까지 나누며(i / j가 0이면 약수) 약수 개수 세기
        * 3. 약수의 개수가 짝수면 result에 더하고 홀수면 result에서 빼기
        */
        int result = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        
        return result;
    }
}