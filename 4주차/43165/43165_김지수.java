// Solution 1
class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        if(depth == numbers.length) {
            if (target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}


// Solution 2 이해 어려우니까 다시 보기
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}


// Solution 3
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