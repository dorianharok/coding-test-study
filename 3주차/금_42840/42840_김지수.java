// Solution 1
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] spj1 = {1, 2, 3, 4, 5};
        int[] spj2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] spj3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cntCorrect = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == spj1[i%5]) cntCorrect[0]++;
            if (answers[i] == spj2[i%8]) cntCorrect[1]++;
            if (answers[i] == spj3[i%10]) cntCorrect[2]++;
        }

        List<Integer> answerList = new ArrayList<Integer>();

        int max = Math.max(cntCorrect[0], Math.max(cntCorrect[1], cntCorrect[2]));

        for (int i = 0; i < 3; i++) {
            if (cntCorrect[i] == max) answerList.add(i + 1);
        }

//        return answerList.stream().mapToInt(Integer::intValue).toArray();
        int size = answerList.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;

    }
}


// Solution 2
import java.util.*;

class Solution {
    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;

        return answer;
    }
}