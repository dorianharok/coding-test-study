import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        if(score.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=score.length -1; i>=0; i--){
            stack.add(score[i]);

            if(stack.size() == m){
                while(!stack.isEmpty()){
                    min = Math.min(stack.pop(), min);
                }
                answer += min * m;
            }
        }
        return answer;
    }
}