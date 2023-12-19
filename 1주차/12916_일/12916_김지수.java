// Solution 1
import java.util.*;
class Solution1 {
    boolean solution(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {
            {
                put('p', 0);
                put('y', 0);
            }
        };

        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') map.put('p', map.get('p') + 1);
            if (c == 'y' || c == 'Y') map.put('y', map.get('y') + 1);
        }

        return (map.get('p').equals(map.get('y')));
    }
}
/* 시간복잡도: O(N) => 문자열 s의 길이를 N이라고 했을 때 */


// Solution 2
class Solution2 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}


// Solution 3
class Solution3 {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}


// solution 4
class Solution4 {
    boolean solution(String s) {

        return s.replaceAll("[^yY]", "").length() == s.replaceAll("[^pP]", "").length();
    }
}
/* [^yY]: 'y' 또는 'Y'를 제외한 어떤 문자와 일치 */