package org.example.level1;

/**
 * 두 수의 나눗셈
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
class Solution7 {
    public int solution(int num1, int num2) {
        float answer =  ((float)num1 / (float)num2) * 1000;
        return (int) answer;
    }
}