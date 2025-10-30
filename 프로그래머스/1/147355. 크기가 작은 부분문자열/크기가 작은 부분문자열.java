class Solution {
    /**
    * 문제 해석
    * 1. 숫자로 이루어진 문자열 t, p가 주어진다.
    * 2. 문자열 t에서, p와 길이가 같은 부분문자열 중에서
    * 이 t에서의 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 리턴
    */
    public int solution(String t, String p) {
        /**
        * 문제 풀이
        * 1. 문자열 t에서 p의 길이만큼 문자열을 잘라서 얻어온다.
        * 2. 단, 잘라서 얻어올 때 마지막 경우의 수가 되는 문자열은 첫 번째 인덱스가 t의 length에서 p의 length를 뺀 값이다.
        * 3. 예를 들어, p가 3자리일 경우 t.length() - 3
        */        
        int cnt = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tNum = Long.parseLong(t.substring(i, i + p.length()));
            long pNum = Long.parseLong(p);
            if (tNum <= pNum) {
                cnt++;
            }
        }
        
        return (int) cnt;
    }
}