package org.example.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * 약수의 합
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */
class Solution14 {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        List<Integer> num = new ArrayList<>();

        while(start <= n){
            if(n % start == 0){
                num.add(start);
            }
            start++;
        }

        for(int i = 0 ; i < num.size() ; i++){
            answer = answer + num.get(i);
        }
        return answer;
    }
}