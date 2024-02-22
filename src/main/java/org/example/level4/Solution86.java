package org.example.level4;

import java.util.*;

class Solution86 {
    public int solution(int[] citations) {
        int answer = 0, len = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < len; i++) {
            int hIndex = len - i;
            if (citations[i] >= hIndex) {
                answer = hIndex;
                break;
            }
        }
        return answer;
    }
}