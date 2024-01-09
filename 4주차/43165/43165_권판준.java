public class No_43165 {
    // https://travelerfootprint.tistory.com/365
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        return answer;
    }

    public static void DFS(int[] numbers, int target, int sum, int deep) {
        if (deep == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        DFS(numbers, target, sum + numbers[deep], deep + 1);
        DFS(numbers, target, sum - numbers[deep], deep + 1);
    }
}