public class Solution {
    public int solution(int n) {
        String number = String.valueOf(n);
        int[] arr = new int[number.length()];
        int answer = 0;
        
        for (int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i) - 48;
            answer += arr[i];
        }
        
        return answer;
    }
}