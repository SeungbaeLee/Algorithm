package org.example.level4;


import java.util.Stack;

public class Solution68 {
    public int solution(int[] ingredient) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int in : ingredient) {
            stack.push(in);
            if (stack.size() >= 4) {
                int size = stack.size();
                if(stack.get(size - 1) == 1
                        && stack.get(size - 2) == 3
                        && stack.get(size - 3) == 2
                        && stack.get(size - 4) == 1) {
                    result++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution68 divideString = new Solution68();
        System.out.println(divideString.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));    // 2
        System.out.println(divideString.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));    // 0
    }
}
