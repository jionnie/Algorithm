class Solution {
    /*
    문제 해석
    1. 0~9 숫자 중 일부가 들어있는 정수 배열 numbers가 주어진다.
    2. numbers에 존재하지 않는 0~9 사이의 숫자를 모두 찾아 더한 수를 리턴한다.
    */
    public int solution(int[] numbers) {
        /*
        의사 코드
        1. 존재 여부를 저장할 boolean 배열을 선언한다.
        2. for 문으로 numbers의 요소를 돌면서 각 요소와 일치하는 isNumExists 인덱스 값을 true로 변경한다.
        2. 존재하지 않는(false)인 요소의 인덱스를 int 변수 sum에 저장한다.
        */
        int sum = 0;
        boolean[] isNumExists = new boolean[10]; // boolean 기본 초기값은 false
        
        for (int i = 0; i < numbers.length; i++) {
            isNumExists[numbers[i]] = true;
        }
        
        for (int i = 0; i < isNumExists.length; i++) {
            if (isNumExists[i] == false) {
                sum += i;
            }
        }
        
        return sum;
        
    }
}