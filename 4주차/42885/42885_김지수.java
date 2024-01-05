// Solution 1
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;
        int answer = 0;

        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                answer++;
                start++;
                end--;
            } else {
                answer++;
                end--;
            }
        }

        return answer;
    }
}


// Solution 2 
import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        
        for ( ; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }

        return people.length - i;
        // 사람 수 - 두 명 태우는 경우의 수 => 한 명 태우는 경우의 수 + 두 명 태우는 경우의 수
    }
}