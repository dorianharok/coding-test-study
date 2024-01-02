public class No_178871 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        new No_178871().solution3(players, callings);
    }
    public String[] solution(String[] players, String[] callings) { // 시간 초과
        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(callings[i])) {
                    String tmp = players[j - 1];
                    players[j - 1] = players[j];
                    players[j] = tmp;
                    break;
                }
            }
        }

        return players;
    }

    public String[] solution2(String[] players, String[] callings) { // 시간 초과
        ArrayList<String> list = new ArrayList<>(Arrays.asList(players));
        for (int i = 0; i < callings.length; i++) {
            int callingRank = list.indexOf(callings[i]);
            list.set(callingRank, list.get(callingRank - 1));
            list.set(callingRank - 1, callings[i]);
        }

        return list.toArray(String[]::new);
    }

    public String[] solution3(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            Integer callingRank = map.get(callings[i]);
            String tmp = players[callingRank - 1];

            players[callingRank - 1] = players[callingRank];
            map.replace(players[callingRank], callingRank - 1);

            players[callingRank] = tmp;
            map.replace(tmp, callingRank);
        }

        return players;
    }
}