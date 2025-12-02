/**
* 문제 해석
* 1. 각 기사에게는 1번부터 number까지 번호가 지정되어 있다. (number 명)
* 2. 각 기사는 자신의 기사 번호의 약수의 개수에 해당하는 공격력을 가지는 무기를 구매한다.
* 3. 단, 공격력 제한 수치보다 큰 공격력을 가진 무기를 구매해야할 경우 정해진 공격력을 가지는 무기를 구매한다.
* 4. 제한 수치를 초과한 기사가 사용할 무기의 공격력을 power이다.
* 5. 무기의 공격력 1당 1kg 철이 필요한데, 무기를 모두 만들기 위해 필요한 철의 무게를 리턴해라.
*/
class Solution {
    public int solution(int number, int limit, int power) {
        /**
        * 문제 풀이
        * 1. 각 수의 약수 개수를 구한다.
        * 2. 공격력 제한 수치인 limit을 넘는 게 있을 경우 power로 대신한다.
        * 3. 각 무기의 공력력이 곧 철의 무게이므로 전부 더한다.
        */
        int[] numbers = new int[number];
        int[] weapons = new int[number];
        int divisor = 0;
        int answer = 0;
        
        for (int i = 0; i < number; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= Math.sqrt(numbers[i]); j++) {
                if (numbers[i] % j == 0) {
                    if (j == Math.sqrt(numbers[i])) {
                        divisor++;
                        break;
                    }
                    divisor += 2;
                }
            }

            if (divisor > limit) {
                divisor = power;
            }
            
            weapons[i] = divisor;
            divisor = 0;
        }
        
        for (int w : weapons) {
            answer += w;
        }
        
        return answer;
    }
}