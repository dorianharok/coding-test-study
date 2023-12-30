class Solution {
    public String[] solution(String[] players, String[] callings) {
        for(int i=0; i<callings.length; i++){
            for(int j=1; j<players.length; j++){
                if(callings[i].equals(players[j])){
                    String temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                    break;
                }
            }
        }

        return players;
    }
}
// 위에코드 마지막 2개가 시간초과
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0; i<players.length; i++){
            hm.put(players[i], i);
        }

        for(String c:callings){
            int rank = hm.get(c);
            String temp = players[rank-1];
            players[rank-1] = c;
            players[rank] = temp;

            hm.put(c, rank-1);
            hm.put(temp, rank);
        }

        return players;
    }
}
