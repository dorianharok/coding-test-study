import java.util.*;
class Solution {
    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        String number ="";
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
            else{
                number += c;
                if(map.containsKey(number)){
                    sb.append(map.get(number));
                    number = "";
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}

