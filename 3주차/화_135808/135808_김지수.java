// Solution 1

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // [1: 3, 2: 2, 3: 2] => [3, 3, 2, 2], [1, 1, 1]
        // [1: 2, 2: 4, 4: 6] => [4, 4, 4], [4, 4, 4], [2, 2, 2], [2, 1, 1]
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i - (m - 1) >= 0; i -= m) {
            answer += m * (score[i - (m - 1)]);
        }
        return answer;
    }
}


// Solution 2
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
