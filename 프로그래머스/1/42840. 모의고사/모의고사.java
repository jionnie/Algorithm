import java.util.*;

/**
* 문제 해석
* 1. 3명의 수포자가 다음과 같은 패턴으로 문제의 답을 찍는다.
* -> 1번 수포자: 1, 2, 3, 4, 5 ...
* -> 2번 수포자: 2, 1, 2, 3, 2, 4, 2, 5 ...
* -> 3번 수포자: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ...
* 2. 1번 문제부터 마지막 문제까지의 정답이 담긴 배열 answers가 주어진다.
* 3. 가장 많은 문제를 맞힌 사람을 배열에 담아 리턴한다.
* 4. 이 때, 정답 수가 동일하면 전부 담아서 리턴하고, 오름차순 정렬한다.
*/
class Solution {
    public int[] solution(int[] answers) {
        /**
        * 문제 풀이
        * 1. 수포자들의 정답 패턴을 다룰 인덱스 변수 index 선언
        * 2. 각 수포자들의 반복 패턴 수 (1번은 5개, 2번은 8개, 3번은 10개) 만큼 돌고 인덱스 초기화
        * 3. 수포자들의 답을 돌면서 정답이면 카운트
        */
        
        List<Integer> answer = new ArrayList<>();
        
        int[][] mathQuitter = new int[3][];
        mathQuitter[0] = new int[] { 1, 2, 3, 4, 5 };
        mathQuitter[1] = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        mathQuitter[2] = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
   
        int k = 0;
        int[] cntOfAnswer = new int[3];
        
        for (int i = 0; i < mathQuitter.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (k == mathQuitter[i].length) {
                        k = 0;
                    }
                
                if (answers[j] == mathQuitter[i][k]) {
                    cntOfAnswer[i]++;
                    k++;
                    
                    continue;
                }
                k++;
            }
            k = 0;
        }
        
        int max = Arrays.stream(cntOfAnswer).max().getAsInt();
        
        for (int i = 0; i < cntOfAnswer.length; i++) {
            if (max == cntOfAnswer[i]) {
                answer.add(i + 1);
            }
        }

        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();            
    }
}