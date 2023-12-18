import java.util.*;
class Solution {
    public int solution(String s) {
        Queue<Character> q = new ArrayDeque<>();
        int cnt = 0;
        int firstNum = 0;
        int secondNum = 0;
        for(int i=0; i<s.length(); i++){
            if(q.isEmpty()){
                q.add(s.charAt(i));
                firstNum++;
                continue;
            }
            if(s.charAt(i) == q.peek()){
                q.add(s.charAt(i));
                firstNum++;
            }
            else{
                q.add(s.charAt(i));
                secondNum++;
                if(firstNum == secondNum){
                    int len = q.size();
                    for(int j=0; j < len; j++){
                        q.remove();
                    }
                    cnt++;
                }
            }
        }
        if(!q.isEmpty()) cnt++;
        return cnt;
    }
}