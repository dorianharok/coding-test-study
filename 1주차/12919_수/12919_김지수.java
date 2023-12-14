import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 " + String.valueOf(idx) + "에 있다";
        return answer;
    }
}