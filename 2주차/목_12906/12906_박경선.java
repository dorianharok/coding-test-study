import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if(stack.isEmpty()) stack.add(i);
            if(stack.peek() == i) continue;
            stack.add(i);
        }
        return stack.stream().mapToInt(i-> i).toArray();
    }
}
