class Solution {
    static int max;
    static int answer = 0;
    static int[] arr;

    public int solution(int[] numbers, int target) {
        max = numbers.length;
        arr = numbers;
        dfs(0, target, 0);

        return answer;
    }

    public void dfs(int count, int target, int sum) {
        if(count == max) {
            if(sum == target) {
                answer++;
            }

            return;
        }

        dfs(count+1, target, sum + arr[count]);
        dfs(count+1, target, sum - arr[count]);
    }
}

