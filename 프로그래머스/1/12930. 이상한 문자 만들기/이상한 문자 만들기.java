class Solution {
    /**
    * 문제 해석
    * 1. 한 개 이상의 단어로 구성된 문자열이 주어지고, 각 단어는 공백으로 구분
    * 2. 각 단어의 짝수 번째 알파벳은 대문자로, 홀수 번째 알파벳은 소문자로 변환
    * 3. 0부터 시작, 0번째 인덱스는 짝수로 처리
    */
    public String solution(String s) {
        /**
        * 문제 풀이
        * 1. 주어진 문자열 s를 char 배열로 변환
        * 2. 인덱스로 순회하면서 문자가 0이면 인덱스 초기화
        * 3. 0을 만나지 않으면 인덱스를 1씩 늘리면서 홀수인지 짝수인지 판별 후 toUpperCase(), toLowerCase() 호출
        * 4. 각 단어들은 "하나 이상의" 공백 문자로 구분되어 있다는 것에 주의
        */
        
        char[] words = s.toCharArray();
        int index = 0;
        
        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') {
                index = 0; // 공백을 만나면 단어로 취급을 안함
            } else {
                words[i] = (index % 2 == 0) ? Character.toUpperCase(words[i]) : Character.toLowerCase(words[i]);
                index++;
            }
        }
        
        return String.valueOf(words);
    }
}