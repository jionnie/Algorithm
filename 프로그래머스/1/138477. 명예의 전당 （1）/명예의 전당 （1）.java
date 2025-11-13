import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;

/**
* 문제 해석
* 1. 명예의 전당 자리 수 k가 주어진다. (명예의 전당에 k명만 올라갈 수 있음)
* 2. 처음 k일까지는 모든 출연 가수가 명예의 전당에 오름
* 3. k일 다음부터는 새로운 출연 가수의 점수가 기존 명예의 전당 목록의 k번째 순위(마지막) 가수의 점수보다 높으면 갱신됨
* 4. 명예의 전당에 오를 수 있는 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수 score가 주어짐
* 5. 매일마다 발표된 명예의 전당 최하위 점수를 저장한 배열을 리턴
*/
class Solution {
    public int[] solution(int k, int[] score) {
        /**
        * 문제 풀이
        * 1. 명예의 전당을 우선순위 큐를 이용해서 저장
        */
        Queue<Integer> hallOfFame = new PriorityQueue<>();
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            
            if (hallOfFame.size() > k) {
                hallOfFame.poll(); // 가장 낮은 점수 꺼냄(우선순위)
            }
            
            answer[i] = hallOfFame.peek();
        }
        
        return answer;
    }
}