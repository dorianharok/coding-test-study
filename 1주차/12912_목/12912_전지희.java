class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        long start = Math.min(a, b);
        long end = Math.max(a, b);
        long count = end - start + 1;

        answer = (start + end) * count / 2;

        return answer;
    }
}
