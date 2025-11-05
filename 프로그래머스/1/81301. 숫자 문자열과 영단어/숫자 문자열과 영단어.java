class Solution {
    /**
    * 문제 해석
    * 1. A가 B에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꿔서 건네주면 B는 원래 숫자를 찾는 게임
    * 2. 1478 -> "one4seveneight"
    * 3. 이렇게 숫자 일부 자릿수가 영단어로 바뀌었거나, 혹은 바뀌지 않고 그대로인 문자열 s가 주어짐
    * 4. s가 의미하는 원래 문자열 리턴
    */
    public int solution(String s) {
        /*
        * 문제 풀이
        * 1. replaceAll 활용해서 단어를 숫자로 대체
        */
        String answer = s.replaceAll("zero", "0");
        answer = answer.replaceAll("one", "1");
        answer = answer.replaceAll("two", "2");
        answer = answer.replaceAll("three", "3");
        answer = answer.replaceAll("four", "4");
        answer = answer.replaceAll("five", "5");
        answer = answer.replaceAll("six", "6");
        answer = answer.replaceAll("seven", "7");
        answer = answer.replaceAll("eight", "8");
        answer = answer.replaceAll("nine", "9");
        
        return Integer.parseInt(answer);
    }
}