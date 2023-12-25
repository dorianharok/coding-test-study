import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> ranking = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            ranking.add(score[i]);
            if (ranking.size() > k) {
                ranking.remove(Collections.min(ranking));
            }
            answer[i] = Collections.min(ranking);
        }
        
        return answer;
    }
}
