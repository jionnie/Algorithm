import java.util.*;

/**
* 문제 해석
* 1. 사과는 상태에 따라 1점 ~ k점(최고점수)
* 2. 한 상자에 사과를 m개씩 담아서 포장
* 3. 상자에 담긴 사과 중 가장 낮은 점수가 p이면, 사과 "한 상자"의 가격은 p * m
* 4. 얻을 수 있는 최대 이익을 리턴
* 5. k = 3, m = 4 이고, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1] 이면 [2, 3, 2, 3] 이 최대 이익 구조 1상자
* 6. 그 다음 최대 이익 구조 상자 반복해서 구함
* 7. p * m * (상자 개수)를 리턴해야함
*/
class Solution {
    public int solution(int k, int m, int[] score) {
        /**
        * 문제 풀이
        * 1. score 배열을 정렬한다.
        * 2. 인덱스를 m개씩 뒤로 돌면서 최솟값을 찍어낸다.
        * 3. 최솟값 * m 한 값을 반복적으로 더해준다.
        */
        int profit = 0;

        Arrays.sort(score);

        for (int i = score.length - m; i >= 0; i -= m) {
            int p = score[i];
            
            profit += (p * m);
        }
        
        return profit;
    }
}