// Solution 1
import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);

            if (map.containsKey(key)) {
                answer[i] = i - map.get(key);
                map.put(key, i);
            } else {
                answer[i] = -1;
                map.put(key, i);
            }
        }
        return answer;
    }
}


// Solution 2
import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            answer[i] = i - map.getOrDefault(c, i + 1);
            map.put(c, i);
        }

        return answer;
    }
}


// Solution 3
class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            String subStr = s.substring(0, i);
            char c = s.charAt(i);

            if(subStr.indexOf(c) == -1) {
                result[i] = -1;
            }else {
                result[i] = i - subStr.lastIndexOf(c);
            }
        }
        return result;
    }
}