// Solution 1
class Solution1 {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += (long) i;
        }
        return answer;
    }
}
/* 시간복잡도: O(큰값 - 작은값) */

// Solution 2
class Solution2 {
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
/* 시간복잡도: O(1) */