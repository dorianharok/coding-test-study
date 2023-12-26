import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameToYearning = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameToYearning.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;
            for (String person : photo[i]) {
                totalYearning += nameToYearning.getOrDefault(person, 0);
            }
            answer[i] = totalYearning;
        }

        return answer;
    }
}
