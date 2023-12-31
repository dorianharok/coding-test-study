import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                score[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                score[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                score[2]++;
            }
        }
        
        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);
        
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                resultList.add(i + 1);
            }
        }
        
        answer = new int[resultList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
