import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int j = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            if (j > i) {
                break;
            }
            if (people[i] + people[j] <= limit) {
                j++;
            }
            answer++;
        }
        return answer;
    }
}