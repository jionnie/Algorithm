/**
* 문제 해석
* 1. 2016년 1월 1일은 금요일
* 2. 2016년 a월 b일의 요일을 리턴 "SUN", "MON" 형태로 리턴
* 3. 2016년은 윤년(2월이 29일까지 있음)
*/
class Solution {
    public String solution(int a, int b) {
        /*
        * 문제 풀이
        * 1. 1월:31일 / 2월:29일 / 3월:31일 / 4월:30일 / 5월:31일 / 6월:30일 / 7월:31일
        *    8월:31일 / 9월:30일 / 10월:31일 / 11월:30일 / 12월:31일
        * 2. 주어진 월(a)의 앞 월(a-1)까지 switch 문으로 처리한 후 일수를 더함
        * 3. 1월 1일 금요일을 1로 둠
        * 4. 2번에서 더해서 나온 수를 7로 나눈 후, 요일을 매치
        */
        int day = 0;
        
        for (int i = 1; i < a; i++) {
            switch (i) {
                case 1: day += 31; break;
                case 2: day += 29; break;
                case 3: day += 31; break;
                case 4: day += 30; break;
                case 5: day += 31; break;
                case 6: day += 30; break;
                case 7: day += 31; break;
                case 8: day += 31; break;
                case 9: day += 30; break;
                case 10: day += 31; break;
                case 11: day += 30; break;
                default: day += 31; break;
            }
        }
        
        day += b;
        
        String answer = switch (day % 7) {
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "THU";
        };
        
        return answer;
    }
}