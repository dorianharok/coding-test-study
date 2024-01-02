import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for(int i=0; i<players.length; i++){
            rankMap.put(players[i], i);
        }
        for (String player : callings) {
            int myRank = rankMap.get(player);
            // 앞에있는 선수
            String prePlayer = players[myRank-1];
            // players 배열 갱신
            players[myRank-1] = player;
            players[myRank] = prePlayer;

            // rankMap 갱신
            rankMap.put(player, myRank-1);
            rankMap.put(prePlayer, myRank);

        }
        return players;
    }
    //다음과 같이 풀었으나 시간초과 발생! 결국 풀이참조함
    public static String[] solution_fail(String[] players, String[] callings){
        // 1등 ~ 현재등수 순으로 담긴 players
        // 역전 할때마다 불린 callings
        ArrayList<Player> list = new ArrayList<>();
        for(int i=0; i< players.length; i++){
            list.add(new Player(i+1, players[i]));
        }

        for(int i=0; i< callings.length; i++){
            for (Player ranking : list) {
                if(ranking.name.equals(callings[i])) {
                    ranking.rank-=1;
                    list.get(ranking.rank-1).rank += 1;
                }
            }
            Collections.sort(list);
        }


        String[] answer = new String[list.size()];
        for(int i=0 ;i<list.size(); i++){
            answer[i] = list.get(i).name;
        }
        return answer;
        // stream 사용 방법
//        return list.stream().map(player -> player.name).toArray(String[]::new);
    }
}
class Player implements Comparable<Player>{
    int rank;
    String name;

    public Player(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    @Override
    public int compareTo(Player o) {
        if(rank < o.rank) return -1;
        if(rank > o.rank) return 1;
        return 0;
    }

}