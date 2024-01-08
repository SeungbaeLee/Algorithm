package org.example.level4;

import java.util.HashMap;
import java.util.Map;

public class Solution72 {
    public String[] solution(String[] players, String[] callings) {
        //초기 선수 순위
        Map<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        //순위 변경
        for (String p : callings) {
            //현재 등수
            int currentRank = rank.get(p);
            //제쳐진 선수
            String chasePlayer = players[currentRank - 1];
            //player 순위 갱신
            players[currentRank-1] = p;
            players[currentRank] = chasePlayer;
            //rank 순위 갱신
            rank.put(p, currentRank - 1);
            rank.put(chasePlayer, currentRank);
        }
        return players;
    }
}