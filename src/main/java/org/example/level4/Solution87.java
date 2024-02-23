package org.example.level4;

import java.util.*;
class Solution87 {
    public  List<Long> solution(int n, long left, long right) {

        List<Long> list = new ArrayList<>();

        for(long i=left;i<right+1;i++){
            list.add(Math.max(i/n,i%n) + 1);
        }

        return list;
    }
}