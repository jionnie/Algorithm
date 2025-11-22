import java.util.*;
/**
* 문제 해석
* 1. 주어진 숫자 배열 중 "3개의 수"를 더했을 때 소수가 되는 경우의 개수 구하기
*/
class Solution {
    public int solution(int[] nums) {
        /**
        * 문제 풀이
        * 1. 소수: 1보다 큰 자연수 중에 1과 자기 자신만을 약수로 가지는 수
        * 2. 완전 탐색
        * 3. 소수 판별 알고리즘 (약수는 대칭적이며 한 쪽은 무조건 제곱근 보다 작음)
        * -> 15의 약수 1, 3, 5, 15 제곱근이 대충 3.xxx라고 하면 3, 5 중 작은 쪽 3은 항상 제곱근 보다 작음
        */
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k]; // 3개의 수를 더함
                    
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    // 소수 판별 메소드
    private boolean isPrime(int n) {
        if (n == 1) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}