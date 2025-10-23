import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for (int element : arr) {
            if (element % divisor == 0) {
                list.add(element);   
            }
        }
        
        if (list.isEmpty()) {
            answer = new int[] { -1 };
            return answer;
        }
        
        Collections.sort(list);
        
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}