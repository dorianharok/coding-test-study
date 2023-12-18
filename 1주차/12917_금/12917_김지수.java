// Solution 1

import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        // Collections.reverse()는 list를 내림차순으로 정렬시킬 수 있음
        Collections.reverse(Arrays.asList(answer));
        return String.join("", answer);
    }
}

/* 시간복잡도: O(N log N) => Arrays.sort()에서 퀵소트 같은 정렬 알고리즘 사용 */

//        테스트 1 〉	통과 (0.76ms, 76MB)
//        테스트 2 〉	통과 (0.77ms, 71.1MB)
//        테스트 3 〉	통과 (0.85ms, 73.6MB)
//        테스트 4 〉	통과 (0.73ms, 74.2MB)
//        테스트 5 〉	통과 (3.27ms, 79MB)
//        테스트 6 〉	통과 (1.88ms, 74.3MB)
//        테스트 7 〉	통과 (1.03ms, 81.7MB)
//        테스트 8 〉	통과 (1.39ms, 73.7MB)
//        테스트 9 〉	통과 (1.41ms, 77MB)
//        테스트 10 〉	통과 (1.26ms, 74.5MB)
//        테스트 11 〉	통과 (0.61ms, 79.1MB)
//        테스트 12 〉	통과 (0.86ms, 91.8MB)
//        테스트 13 〉	통과 (0.85ms, 72.2MB)
//        테스트 14 〉	통과 (0.44ms, 71.3MB)
//        테스트 15 〉	통과 (0.52ms, 74MB)
//        테스트 16 〉	통과 (0.58ms, 78.5MB)


// Solution 2 -> 이 방법이 좀 더 빠른 듯
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        // StringBuilder와 StringBuffer에 reverse()메서드 존재
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
/* 시간복잡도: O(N log N) => 정렬 */

//        테스트 1 〉	통과 (0.51ms, 77.7MB)
//        테스트 2 〉	통과 (0.58ms, 80MB)
//        테스트 3 〉	통과 (0.52ms, 88.7MB)
//        테스트 4 〉	통과 (0.40ms, 66.1MB)
//        테스트 5 〉	통과 (0.76ms, 74MB)
//        테스트 6 〉	통과 (0.45ms, 69MB)
//        테스트 7 〉	통과 (0.54ms, 77MB)
//        테스트 8 〉	통과 (0.42ms, 78.7MB)
//        테스트 9 〉	통과 (0.40ms, 74.4MB)
//        테스트 10 〉	통과 (0.45ms, 79.6MB)
//        테스트 11 〉	통과 (0.36ms, 74.4MB)
//        테스트 12 〉	통과 (0.38ms, 77.6MB)
//        테스트 13 〉	통과 (0.59ms, 76MB)
//        테스트 14 〉	통과 (0.41ms, 75.7MB)
//        테스트 15 〉	통과 (0.50ms, 74.1MB)
//        테스트 16 〉	통과 (0.32ms, 70.5MB)