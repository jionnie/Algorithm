import java.util.*;

class Solution {
    /**
    * 문제 해석
    * 1. 배열을 i번째부터 j번째까지 자르고 정렬한다.
    * 2. 그리고 나서 k번째에 있는 수를 구한다.
    * 3. 배열 array와 [i, j, k]가 2차원 배열로 주어진다.
    * 4. 각 연산 결과를 배열로 반환한다.
    */
    public int[] solution(int[] array, int[][] commands) {
        /**
        * 문제 풀이
        * 1. commands 배열을 돌면서 i, j, k 값을 얻는다.
        * 2. array를 i번째부터 j번째까지 list에 저장하고 정렬한다. (1부터 시작임)
        * 3. k번째를 얻는다.
        * 4. list를 비우고 다시 반복한다.
        */
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1).intValue();
            list.clear();
        }
        return answer;
    }
}