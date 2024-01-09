class Solution {
    static int goal;
    static int answer=0;
    static int[] arr;
    public int solution(int[] numbers, int target) {
        arr = numbers;
        goal = target;
        dfs(0, 0, numbers);
        return answer;
    }
    private static void dfs(int depth, int sum, int[] numbers) {
        if (depth == numbers.length) {
            if (sum == goal) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, sum + arr[depth], numbers);
        dfs(depth + 1, sum - arr[depth], numbers);
    }
}