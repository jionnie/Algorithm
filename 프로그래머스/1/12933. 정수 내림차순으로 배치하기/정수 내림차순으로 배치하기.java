class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = String.valueOf(n).length();
        long[] notSorted = new long[length];
        long[] sorted = new long[length];
        
        for (int i = 0; i < length; i++) {
            notSorted[i] = n % 10;
            n /= 10; // 2 7 3 8 1 1
        }
        
        
        int index = 0;
        while (index < length) {
            long max = -1;
            int max_index = -1;
            for (int i = 0; i < length; i++) {
                if (notSorted[i] > max) {
                    max = notSorted[i];
                    max_index = i;
                }
            }
            notSorted[max_index] = -1;
            sorted[index] = max;
            index++;
        }
        
        String strAnswer = "";
        for (long a : sorted) {
           strAnswer += a;
        }
        
        answer = Long.parseLong(strAnswer);
        
        return answer;
    }
}