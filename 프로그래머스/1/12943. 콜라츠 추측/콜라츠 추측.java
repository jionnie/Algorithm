class Solution {
    public int solution(int num) {
        long collatz = num; // 1-2번 연산 중 int 타입의 허용 범위를 넘어가는 경우가 있어서 long으로 선언
        int cnt = 0;
        
        if (collatz == 1) return 0;
           
        while (collatz != 1) {
            if (cnt > 500) {
                return -1;
            }
            
            collatz = (collatz % 2 == 0) ? collatz /= 2 : (collatz * 3) + 1;
            cnt++;
        }
        
        return cnt;
    }
}