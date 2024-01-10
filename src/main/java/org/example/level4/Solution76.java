package org.example.level4;

public class Solution76 {
    public String solution(String s) {
        String answer = "";

        // " " 기준으로 문자열 자르기
        String[] arr = s.split(" ");
        //잘린 문자열 처리 반복문
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];

            //공백이면 " " 추가
            if (arr[i].length() == 0) {
                answer += " ";
            } else {
                //문자 있으면 첫번째는 대문자, 나머지 소문자 마지막에 공백 넣어주기
                answer += temp.substring(0, 1).toUpperCase();
                answer += temp.substring(1, temp.length()).toLowerCase();

                answer += " ";
            }
        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        }

        //마지막 공백 삭제
        return answer.substring(0, answer.length()-1);
    }
}