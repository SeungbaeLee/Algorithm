package org.example.level3;

public class Solution60 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        int test = 0;

        //기사 수 반복
        for (int i = 1; i < number + 1; i++) {
            count = 1;
            test = i / 2; // 약수 확인 시 절반만 수행

            //현재 기사 약수 반복문
            for (int j = 1; j < test + 1; j++) {
                //i가 j로 떨어지면 약수, count++
                if ((i & j) == 0) {
                    count++;
                }
                if (count > limit) {
                    //약수의 개수 초과하면 count = limit
                    count = power;
                    break;
                }
            }
            answer += count;
        }
        return answer;
    }
}


