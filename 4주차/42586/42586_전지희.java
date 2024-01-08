import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }
        
        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()){
            int date = queue.poll();
            int deploy = 1;
            
            while(!queue.isEmpty() && date >= queue.peek()){
                deploy++;
                queue.poll();
            }
            answer.add(deploy);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
