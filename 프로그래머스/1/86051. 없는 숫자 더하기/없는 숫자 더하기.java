class Solution {
    /*
    문제 해석
    1. 0~9 숫자 중 일부가 들어있는 정수 배열 numbers가 주어진다.
    2. numbers에 존재하지 않는 0~9 사이의 숫자를 모두 찾아 더한 수를 리턴한다.
    */
    public int solution(int[] numbers) {
        /*
        의사 코드
        1. int sum을 0~9까지의 값을 전부 더한 값으로 초기화한다.
        2. numbers 배열을 순회하면서 각 요소의 값을 sum에서 뺀다.
        */
        int sum = 45; // 0~9까지의 합
        
        for (int num : numbers) {
            sum -= num;
        }
        
        return sum;
    }
}