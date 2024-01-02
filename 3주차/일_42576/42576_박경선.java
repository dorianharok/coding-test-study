import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0)+1);
        }
        for (String person : completion) {
            if(map.containsKey(person)) map.put(person,map.get(person)-1);
        }

        for (String person : participant) {
            if(map.get(person) !=0) answer = person;
        }
        return answer;
    }
}