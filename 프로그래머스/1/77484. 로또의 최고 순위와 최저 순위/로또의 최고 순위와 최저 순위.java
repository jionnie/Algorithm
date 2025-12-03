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
        int[] answer = new int[2];
        int correct = 0;
        int zero = 0;
            
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                    zero++;
                    continue;
                }
            
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    correct++;
                }
            }
        }
        
        answer[0] = correct + zero;
        answer[1] = correct;
        
        for (int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }
        
        return answer;
    }
}