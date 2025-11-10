class Solution {
    /**
    * 문제 해석
    * 1. 음식은 가운데 물을 기준으로 양옆으로 대칭으로 배치한다.
    * 2. 따라서 1번 음식 3개, 2번 음식 2개, 3번 음식 6개라면 "1223330333221"이 된다. (각 수는 음식 번호)
    * 3. 준비한 음식의 양을 나타내는 정수 배열 food가 주어진다.
    */
    public String solution(int[] food) {
        /**
        * 문제 풀이
        * 1. 배열을 돌면서 음식 개수가 홀수이면, 1을 빼고 2로 나눈 수만큼 i+1을 이어붙임
        * 2. 짝수면 그대로 2로 나눈 수만큼 i+1 양옆으로 이어붙임
        * 3. 첫 번째 원소는 물이고, 항상 0임
        */
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            String str = "";
            
            if (food[i] % 2 != 0) {
                str = String.valueOf(i).repeat((food[i] - 1) / 2);
            } else {
                str = String.valueOf(i).repeat(food[i] / 2);
            }
            
            sb.append(str);
        }
        String notReversed = sb.toString();
        sb.append("0");
        String reversed = new StringBuilder(sb).reverse().toString();
        
        return notReversed + reversed;
    }
}