import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> works = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<progresses.length; i++){
            works.offer((int)Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }
        while(!works.isEmpty()){
            int current = works.poll();
            int cnt=1;
            while(!works.isEmpty()&&works.peek()<=current){
                cnt++;
                works.poll();
            }
            result.add(cnt);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}