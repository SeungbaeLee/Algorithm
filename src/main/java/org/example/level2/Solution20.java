package org.example.level2;

/**
 * 정수 내림차순으로 배치하기
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */

class Solution20 {
    public long solution(long n) {
        String forNum = "";
        String toStr = Long.toString(n);

        for (int i = 9; i >= 0; i--) {
            for (int j = toStr.length() - 1; j >= 0; j--) {
                if (Character.getNumericValue(toStr.charAt(j)) == i) {
                    forNum = forNum + toStr.charAt(j);
                }
            }
        }

        long answer = Long.parseLong(forNum);
        return answer;
    }
}
