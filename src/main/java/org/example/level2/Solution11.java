package org.example.level2;

/**
 * 짝수와 홀수
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 */
class Solution11 {
    public String solution(int num) {
        String answer = (num % 2 == 0) ? "Even" : "Odd";


        return answer;
    }
}
