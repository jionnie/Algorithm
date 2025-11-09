import java.util.*;

class Solution {
    /**
    * 문제 해석
    * 1. 문자열 s가 주어진다.
    * 2. s의 각 문자마다 자신보다 앞에 있으면서, 자신과 가장 가까운 곳에 있는 "같은 글자"가 어딨는지 숫자로 저장해서 반환한다.
    * 3. 처음 나온 문자는 -1이다.
    * 4. "banana"는 [-1, -1, -1, 2, 2, 2 ]
    */
    public int[] solution(String s) {
        /*
        * 문제 풀이
        * 1. 주어진 문자열을 char 배열로 변환한다.
        * 2. 알파벳이 나왔는지를 판단하는 int 배열을 선언한다.
        * 3. -1이면 앞에 나온 적이 없는 것, -1이 아니면(마지막 등장 인덱스 저장) 앞에 나온 적이 있는 것.
        */
        char[] arr = s.toCharArray();
        int[] alphabet = new int[26];
        int[] answer = new int[s.length()];
        
        Arrays.fill(alphabet, -1);
        
        for (int i = 0; i < arr.length; i++) {
            if (alphabet[arr[i] - 97] == -1) { // -1 이면 앞에 등장한 적 없음
                answer[i] = -1;     
                alphabet[arr[i] - 97] = i; // 첫 등장이자 가장 마지막 등장이므로 인덱스 저장
            } else { // -1이 아니면 앞에 등장한 적 있음
                answer[i] = i - alphabet[arr[i] - 97];
                alphabet[arr[i] - 97] = i;
            }
        }
        
        return answer;
    }
}