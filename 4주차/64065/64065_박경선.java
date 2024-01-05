import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[{}]", "");

        HashMap<Integer, Integer> map = new HashMap<>();
        for (String str : s.split(",")) {
            int key = Integer.parseInt(str);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((v1, v2) -> map.get(v2).compareTo(map.get(v1)));
        return keys.stream().mapToInt(i->i).toArray();
    }
}