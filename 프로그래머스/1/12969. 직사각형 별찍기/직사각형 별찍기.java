import java.util.Scanner;

class Solution {
    /**
    * 문제 해석
    * 1. 가로 길이가 a, 세로 길이가 b인 직사각형 출력
    */
    public static void main(String[] args) {
        /**
        * 의사 코드
        * 1. 이중 for 문
        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}