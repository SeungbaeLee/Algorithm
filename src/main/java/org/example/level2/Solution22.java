package org.example.level2;

import java.util.stream.IntStream;

public class Solution22 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}