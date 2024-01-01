import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerRankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerRankMap.put(players[i], i + 1);
        }

        for (String calling : callings) {
            int currentRank = playerRankMap.get(calling);
            
            if (currentRank > 1) {
                String currentPlayer = players[currentRank - 1];
                String prevPlayer = players[currentRank - 2];
                
                players[currentRank - 1] = prevPlayer;
                players[currentRank - 2] = currentPlayer;
                
                playerRankMap.put(currentPlayer, currentRank - 1);
                playerRankMap.put(prevPlayer, currentRank);
            }
        }

        return players;
    }
}
