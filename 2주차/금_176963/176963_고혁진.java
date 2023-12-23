import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0; i < yearning.length; i++){
            hm.put(name[i], yearning[i]);
        }
        for(int i=0; i < photo.length; i++){
            String[] photos = photo[i];
            for(String p : photos){
                answer[i] += hm.getOrDefault(p, 0);
            }
        }
        return answer;
    }
}