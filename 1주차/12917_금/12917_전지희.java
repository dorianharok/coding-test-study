import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String i : str)
           answer += i;
        
        return answer;
    }
}
