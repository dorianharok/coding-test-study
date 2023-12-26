import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            // 스택의 크기가 4 이상이고, 맨 위가 빵, 그 다음이 고기, 그 다음이 야채, 그 아래가 빵일 경우
            if (stack.size() >= 4 && stack.peek() == 1 && stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1) {
                answer++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        
        return answer;
    }
}
