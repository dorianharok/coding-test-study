// Solution 1
import java.util.HashMap;
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

        for (String key : map.keySet()) {
            s = s.replaceAll(key, String.valueOf(map.get(key)));
        }

        return Integer.parseInt(s);
    }
}


// Solution 2
class Solution {
    public int solution(String s) {

        String[][] mapArr = { {"0", "zero"},
                {"1", "one"},
                {"2", "two"},
                {"3", "three"},
                {"4", "four"},
                {"5", "five"},
                {"6", "six"},
                {"7", "seven"},
                {"8", "eight"},
                {"9", "nine"} };

        for(String[] map : mapArr){
            s = s.replace(map[1], map[0]);
        }

        return Integer.parseInt(s);
    }
}


// Solution 3
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}