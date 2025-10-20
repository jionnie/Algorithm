class Solution {
    public double solution(int[] arr) {
        double avg = 0;
        double sum = 0;
        
        for (int a : arr) {
            sum += a;
        }
        
        avg = sum / arr.length;
        return avg;
    }
}