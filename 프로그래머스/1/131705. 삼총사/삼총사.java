import java.util.Arrays;

class Solution {
    /**
    * 문제 해석
    * 1. 학생들은 각자 정수 번호를 갖는다.
    * 2. 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 이 3명의 학생을 삼총사라고 한다.
    * 3. 학생들의 번호를 나타내는 정수 배열이 주어질 때, 삼총사를 만들 수 있는 경우의 수를 구해라.
    */
    public int solution(int[] number) {
        /**
        * 문제 풀이
        * 1. 배열 예시 [ 1, 2, 3, 4, 5, 6, 7, 8 ]
        * 2. i: 첫 번째 for 문은 인덱스 i가 0부터 마지막에서 3번째 원소까지만 순회
        * 3. j: 두 번째 for 문은 인덱스 j가 i + 1 부터 마지막에서 두 번째 원소까지만 순회
        * 4. k: 세 번째 for 문은 인덱스 k가 j + 1 부터 마지막까지 순회하면서 모든 경우의 수 더해서 0일 때마다 cnt++
        */
        
        int cnt = 0;
        
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
        
    }
}