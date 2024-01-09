class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        // 정답 참고
        // 현재 어디까지 탐색했는지 : idx
        // 탐색 위치에 따른 합계 : sum
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int idx, int sum) {
        if(idx == numbers.length){
            if(target == sum) answer++;
            return;
        }
        dfs(numbers, target, idx+1, sum+numbers[idx]);
        dfs(numbers, target, idx+1, sum-numbers[idx]);
    }
}
