package org.example.level2;

/**
 * 자릿수 더하기
 * 문제 설명
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
class Solution13 {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);

        for(int i = 0 ; i < num.length() ; i++){
            int digit = Character.getNumericValue(num.charAt(i));
            answer += digit;
        }

        return answer;
    }
}