import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int[] answers = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int answer = 0;
            for (String s : photo[i]) {
                if(!map.containsKey(s)) continue;
                answer += map.get(s);
            }
            answers[i] = answer;
        }
        return answers;
    }
}