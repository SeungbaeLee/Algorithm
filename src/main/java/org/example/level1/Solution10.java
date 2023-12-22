package org.example.level1;

/**
 * 배열의 평균값
 * 문제 설명
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length ; i++){
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}