package org.example.level2;

/**
 * 자연수 뒤집어 배열로 만들기
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
class Solution17 {
    public int[] solution(long n) {//12345
        String number = Long.toString(n);//"12345"
        int length = number.length();//5
        int[] answer = new int[length];//5
        int j = 1;
        for (int i = 0; i < length; i++) {
            answer[i] = Character.getNumericValue(number.charAt(length-j));
            j++;
        }
        return answer;
    }
}