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
        * 1. int i가 left~right 사이를 순회한다.
        * 2. 만약 i가 제곱수면 약수의 개수는 홀수이다.(약수를 나열하면 가운데에 제곱근이 있다.)
        * 3. i가 제곱수가 아니면 약수의 개수는 짝수이다.
        */
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                result -= i;
            } else {
                result += i;
            }
        }
        
        return result;
    }
}