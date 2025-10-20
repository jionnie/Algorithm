class Solution {
    public double solution(int[] numbers) {
        double avg = 0;
        double sum = 0;
        
        for (int number : numbers) {
            sum += (double) number;
        }
        
        avg = sum / numbers.length;
        return avg;
    }
}