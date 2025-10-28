class Solution {
    /**
    * 행렬 덧셈: 행과 열의 크기가 같은 두 행렬에서 같은 행, 같은 열의 값을 서로 더한 값
    * 입력받은 두 행렬의 덧셈을 리턴
    */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        /**
        * 의사 코드
        * 1. 이중 for문
        * 2. 두 행렬의 행과 열의 크기는 같음
        */
        
        int[][] answer = new int[arr1.length][];
        
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = new int[arr1[i].length];
            
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
        
        return answer;
    }
}