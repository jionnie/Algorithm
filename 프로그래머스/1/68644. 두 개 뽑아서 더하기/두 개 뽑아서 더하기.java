import java.util.*;

class Solution {
    /**
    * 문제 해석
    * 1. 주어진 정수 배열 numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑는다.
    * 2. 뽑은 "두 수를 더해 만들 수 있는 모든 수"를 배열에 "오름차순"으로 담아 리턴한다.
    */
    public int[] solution(int[] numbers) {
        /**
        * 문제 풀이
        * 1. 이중 for 문을 돌면서 모든 경우의 수 탐색
        * 2. TreeSet으로 중복 저장 안 되도록 함
        */
        Set<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}