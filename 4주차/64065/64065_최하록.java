import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("},", " ");
        s = s.replaceAll("[\\{}]", "");
        String[] arr = s.split(" ");
        Arrays.sort(arr, (a,b) -> {return a.length() - b.length();});

        int[] answer = new int[arr.length];
        int idx = 0;
        Set<String> set = new HashSet<>();
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }

        return answer;
    }
}