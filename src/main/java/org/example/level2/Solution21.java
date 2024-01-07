package org.example.level2;

public class Solution21 {
    public boolean solution(int x) {
        int hasad = 0;
        String number = Integer.toString(x);//3
        for (int i = 0; i < number.length(); i++) {
            hasad = hasad + Character.getNumericValue(number.charAt(i));
        }
        if (x % hasad == 0) {
            return true;
        }
        return false;
    }
}