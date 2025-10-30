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
        * 2. 첫 번째 인덱스 값, 두 번째 인덱스 값 고정해놓고 그 다음 인덱스부터 이중 for문 돌리기
        */
        
        int cnt = 0;
        int num1 = 0;
        int num2 = 0;
        
        for (int i = 0; i < number.length - 2; i++) {
            num1 = number[i];
            for (int j = i + 1; j < number.length - 1; j++) {
                num2 = number[j];
                for (int k = j + 1; k < number.length; k++) {
                    if (num1 + num2 + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
        
    }
}