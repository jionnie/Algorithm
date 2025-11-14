/**
* 문제 해석
* 1. 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 주어짐
* 2. 한 배열 내에서 카드는 순서대로 꺼내올 수 있음(임의로 건너뛰어서 꺼내올 수 없음)
* 3. 한 번 사용한 카드는 다시 사용 불가
* 4. 두 배열에 적힌 단어들로 goal을 만들 수 있으면 "Yes", 만들 수 없으면 "No" 리턴
*/
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        /**
        * 문제 풀이
        * 1. String answer = "Yes"로 초기화한다.
        * 2. goal의 첫 번째 인덱스의 값을 가져온다.
        * 3. 두 배열을 돌면서 1번에서의 값이 있으면 Yes를 유지하고 goal 다음 인덱스의 값을 가져온다.
        * 4. 두 배열을 돌면서 1번에서의 값이 없으면 No로 바꾸고 리턴한다.
        */
        String answer = "Yes";
        int i = 0;
        int j = 0;
        
        for (String word : goal) {
            if (i < cards1.length && word.equals(cards1[i])) {
                i++;          
            } else if (j < cards2.length && word.equals(cards2[j])) {
                j++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}