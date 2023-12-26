import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (!lastIndexMap.containsKey(currentChar)) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndexMap.get(currentChar);
            }

            lastIndexMap.put(currentChar, i);
        }

        return answer;
    }
}
