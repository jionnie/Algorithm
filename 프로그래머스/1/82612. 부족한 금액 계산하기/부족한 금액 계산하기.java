class Solution {
    /**
    * 문제 해석
    * 1. 놀이기구의 원래 이용료는 price원
    * 2. 놀이기구를 N번째 이용한다면 원래 이용료의 N배를 받음
    * 3. 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 money에서 얼마가 모자라는지를 리턴(리턴값은 양수)
    * 4. 단, 금액이 부족하지 않으면 0을 리턴
    */
    public long solution(int price, int money, int count) {
        /**
        * 의사 코드
        * 1. 첫째항과 공차가 price, 항의 개수가 count인 등차수열
        * 2. (count*(2*price + (count - 1)*price))/2
        */
        
        long a = price;
        long d = price;
        long answer = (count*(2*a + (count - 1)*d))/2;
        answer = money - answer;
        
        if (answer >= 0) {
            return 0;
        }
        
        return answer * -1;
    }
}