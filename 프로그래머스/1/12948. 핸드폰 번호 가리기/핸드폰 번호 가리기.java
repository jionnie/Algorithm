class Solution {
    /*
    문제 해석
    1. 전화번호가 문자열로 주어진다.
    2. 전화번호 뒷 4자리를 제외한 나머지 숫자를 모두 *으로 변환한 문자열을 리턴한다.
    */
    public String solution(String phone_number) {
        /*
        의사 코드
        1. (문자열 길이 - 4) 인덱스 부터 끝까지 뒤의 4자리 추출
        2. (문자열 전체 길이 - 4) 만큼 * 붙이고 추출한 4자리 결합
        */
        String answer = "";
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(phone_number.length() - 4);
        
        return answer;
    }
}