import java.util.Arrays;

class Solution {
    /*
    문제 해석
    1. 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열을 리턴한다.
    2. 단, 리턴 하려는 배열이 빈 배열이면 -1을 채워 리턴한다.
    */
    public int[] solution(int[] arr) {
        /*
        의사 코드
        1. stream API를 이용해 min 값 구하기
        2. index 변수를 이용해 min 값을 제외한 배열을 새 배열에 복사
        */
        if (arr.length == 1) {
            return new int[] { -1 };
        }
        
        int[] newArr = new int[arr.length - 1];
        int min = Arrays.stream(arr).min().getAsInt();
        
        int index = 0;
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] == min) {
                continue;
            }
            newArr[index] = arr[i];
            index++;
        }
        
        return newArr;        
    }
}