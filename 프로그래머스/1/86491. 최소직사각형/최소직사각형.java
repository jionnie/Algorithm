class Solution {
    /**
    * 문제 해석
    * 1. 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열이 주어짐
    * 2. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 리턴
    */
    public int solution(int[][] sizes) {
        /**
        * 문제 풀이
        * 1. 모든 명함을 길이가 긴쪽으로 돌린다.
        * 2. 그 다음 모든 명함을 만족하는 크기 중에 가장 작은 값을 리턴한다.
        */
        int answer = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) { // 2차원 배열의 길이는 무조건 2
                int temp = sizes[i][1];      // 긴 쪽을 한쪽(0번 인덱스)으로 정렬
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        
        int width = 0;
        int length = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (width <= sizes[i][0]) {
                width = sizes[i][0];
            }
            
            if (length <= sizes[i][1]) {
                length = sizes[i][1];
            }
        }
        
        return width * length;
    }
}