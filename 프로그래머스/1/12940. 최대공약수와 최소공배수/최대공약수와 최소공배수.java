class Solution {
    /**
    * 문제 해석
    * 1. 입력 받은 두 수의 최대공약수와 최소공배수를 반환하는 메소드
    * 2. 배열 형태로 반환
    */
    public int[] solution(int n, int m) {
        /**
        * 문제 풀이
        * 1. 최대공약수(gcd): 유클리드 호제법
        * 2. 최소공배수(lcm): 주어진 두 수를 곱한 값을 최대공약수로 나누기
        */
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];
        
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        return (num2 == 0) ? num1 : gcd(num2, num1 % num2);
    }
}