class Solution {
    public int solution(String s) {
        boolean sign = true; // 양수를 기본으로 함
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '-') {
                sign = false; // 음수로 변경
            } else if (c != '+') {
                result = (result * 10) + (c - '0');
            }
        }
        
        return (sign ? 1 : -1) * result;
    }
}