import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> temp = new ArrayList<>();
      
        for (int i = 0; i < strings.length; i++) {
            temp.add("" + strings[i].charAt(n) + strings[i]);
        }
      
        Collections.sort(temp);
      
        answer = new String[temp.size()];
      
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i).substring(1, temp.get(i).length());
        }
        return answer;
    }
}
