class Solution {
    /**
    * 문제 해석
    * 1. 시저 암호: 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
    * 2. "AB"를 1만큼 밀면 "BC", "z"를 1만큼 밀면 "a"
    */
    public String solution(String s, int n) {
        /**
        * 문제 풀이
        * 1. 모든 알파벳 소문자로 변환
        * 2. 대문자였던 요소들은 인덱스를 기억
        * 3. 원소를 순회하면서 마지막 알파벳일 경우 a로 넘어가도록 조건 설정
        * 4. 공백일 경우 아무런 조치를 하지 않고 넘어가도록 조건 설정
        * 5. 대문자였던 요소들 대문자로 원복
        */
        
        char[] arr = s.toCharArray();
        boolean isUpper = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                isUpper = true;
            }
            
            if (arr[i] == 32) {
                continue;    
            }
            
            arr[i] = Character.toLowerCase(arr[i]);
            arr[i] += n;
            
            if (arr[i] > 122) {
                arr[i] = (char) ((arr[i] - 122) + 96);    
            }
            
            if (isUpper) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            
            isUpper = false;
        }
        
        return String.valueOf(arr);
    }
}