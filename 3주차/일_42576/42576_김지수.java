import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 참가자 명단을 해시맵에 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 완주자 명단을 해시맵에서 빼기
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // 완주하지 못한 선수 찾기
        for (String player : participant) {
            if (map.get(player) > 0) {
                answer = player;
                break;
            }
        }
        return answer;
    }
}