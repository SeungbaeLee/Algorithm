package org.example.level4;

public class Solution65 {
    public int solution(String s) {
        int answer = 0;
        while (!s.isEmpty()) {
            int count = 0;
            int countX = 0;
            char first = s.charAt(0); // a

            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i); //a /b
                if (current == first) {
                    count++;//1
                } else {
                    countX++;//1
                }
                if (count == countX) {
                    answer++;//1
                    s = s.substring(i + 1);
                    break;
                }
                if (i == s.length() - 1) {
                    answer++;
                    s = "";
                    break;
                }
            }
        }
        return answer;
    }
}
