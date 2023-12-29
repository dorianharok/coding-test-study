// Solution 1
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (score.containsKey(photo[i][j])) {
                    sum += score.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}
/* 시간복잡도: O(n * m) => n: name 배열의 길이, m: photo 배열의 길이 */

// Solution 2
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }
}
/* 시간복잡도: O(n * m * k) => n: name 배열의 길이, m: photo 배열의 길이, k: name 배열 내의 각 문자열의 길이 */