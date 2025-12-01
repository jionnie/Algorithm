/**
* 문제 해석
* 1. 길이가 n미터인 벽이 있고, 벽을 1미터 길이의 구역 n개로 나누어 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙인다.
* 2. 벽에 페인트를 칠하는 롤러의 길이는 m미터이다.
* 3. 롤러는 벽에서 벗어나면 안 되고, 구역의 일부분만 포함되도록 칠하면 안 된다.
* 4. 정수 n, m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 주어질 때,
*    롤러로 페인트칠해야 하는 최소 횟수를 구하여라.
*/
class Solution {
    public int solution(int n, int m, int[] section) {
        /**
        * 문제 풀이
        * 1. section의 첫 번째를 구역을 시작으로 롤러의 길이를 더한다.
        * 2. 한 번으로 안 되면 롤러의 길이만큼 또 더한다.
        * 3. 이렇게 몇 번을 칠해야 하는지 구한다.
        */
        int pointer = 0;
        int cnt = 0;
        
        for (int i = 0; i < section.length; i++) {
            if (pointer <= section[i]) {
                pointer = section[i] + m;
                cnt++;
            }
        }
        
        return cnt;
    }
}