// Solution 1
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playersIndexMap.put(players[i], i);
        }
        for (String calling : callings) {
            int idx = playersIndexMap.get(calling);
            String temp = players[idx];

            playersIndexMap.replace(players[idx], idx - 1);
            players[idx] = players[idx - 1];

            playersIndexMap.replace(players[idx - 1], idx);
            players[idx - 1] = temp;
        }
        return players;
    }
}