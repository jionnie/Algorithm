class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int length = String.valueOf(x).length();
        int[] nums = new int[length];
        int sum = 0;
        
        int xCopy = x;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = xCopy % 10;
            sum += nums[i];
            xCopy /= 10;
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}