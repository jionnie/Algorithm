import java.util.*;

/**
* 문제 해석
* 1. 로또에서 낙서가 칠해져 알아볼 수 없는 숫자를 0으로 표기한다.
* 2. 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 주어진다.
* 3. 당첨 가능한 최고 순위와 최저 순위를 배열에 담아 리턴해라.
*/
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        /**
        * 문제 풀이
        * 1. lottos에서 0이 있는 자리를 만날 때마다 0의 개수(zero)를 카운트
        * 2. 각 배열을 비교해서 같은 값이 있을 때마다 일치하는 개수(correct) 카운트
        * 3. 1번에서 구한 수에서 0의 자리 수만큼 다 더하면 최고 순위, 더하지 않으면 최저 순위
        */
        int correct = 0;
        int zero = 0;
        
        // 당첨 번호를 Set으로 변환
        Set<Integer> winSet = new HashSet<>();
        
        for (int num : win_nums) {
            winSet.add(num);
        }
        
        // 0 카운트 및 일치하는 개수 카운트
        for (int num : lottos) {
            if (num == 0) {
                zero++;
                continue;
            }
            
            if (winSet.contains(num)) {
                correct++;
            }
        }
        
        int[] rank = { 6, 6, 5, 4, 3, 2, 1 };
        
        int best = correct + zero;
        int worst = correct;
        
        return new int[] { rank[best], rank[worst] };
    }
}