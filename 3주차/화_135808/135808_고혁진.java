import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        //12개니깐 i=11 8 5 2
        for (int i = score.length - 1; i >= 0; i -= m) {
            if (i < m-1)
                break;
            answer += (score[i - m + 1]) * m;
        }

        return answer;
    }
}
