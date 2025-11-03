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
        int width = 0;
        int height = 0;
        
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1])); // 가로를 긴 쪽으로
            height = Math.max(height, Math.min(size[0], size[1]));
        }
        
        return width * height;
    }
}