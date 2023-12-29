package org.example.level4;

class Solution70 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int maxi = Integer.MIN_VALUE,
                mini = Integer.MAX_VALUE,
                maxj = Integer.MIN_VALUE,
                minj = Integer.MAX_VALUE;

        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j) == '#'){
                    maxi = Math.max(maxi, i);
                    mini = Math.min(mini, i);
                    maxj = Math.max(maxj, j);
                    minj = Math.min(minj, j);
                }
            }
        }

        answer[0] = mini;
        answer[1] = minj;
        answer[2] = maxi+1;
        answer[3] = maxj+1;

        return answer;
    }

}