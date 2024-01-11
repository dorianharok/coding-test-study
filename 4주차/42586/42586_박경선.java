import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            int restProgress = (100 - progresses[i]);
            q.add(restProgress / speeds[i] + (restProgress % speeds[i] == 0 ? 0 : 1));
        }
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()){
            int cnt = 1;
            int perDay = q.poll();
            while(!q.isEmpty() && q.peek() <= perDay){
                cnt++;
                q.poll();
            }
            list.add(cnt);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}