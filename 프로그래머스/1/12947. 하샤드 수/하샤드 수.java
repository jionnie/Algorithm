class Solution {
    public boolean solution(int x) {
        String[] nums = String.valueOf(x).split("");
        int sum = 0;
        
        for (String n : nums) {
            sum += Integer.parseInt(n);   
        }
        
        if (x % sum == 0) {
            return true;
        }
        
        return false;
    }
}