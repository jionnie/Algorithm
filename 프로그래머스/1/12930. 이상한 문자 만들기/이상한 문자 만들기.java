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
        * 1. 공백을 기준으로 단어를 분리해서 String 배열에 저장
        * 2. 각 문자열을 char 배열로 변환
        * 3. 인덱스가 0부터 짝수일 때마다 대문자로 변환
        */
        
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
            
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            
            for (int j = 0; j < word.length; j += 2) {
                word[j] = Character.toUpperCase(word[j]);
                if (j + 1 < word.length) {
                    word[j + 1] = Character.toLowerCase(word[j + 1]);
                }
            }
            
            sb.append(word);
            
            if (i < words.length - 1) {
                sb.append(" ");   
            }
        }
        
        return sb.toString();
    }
}