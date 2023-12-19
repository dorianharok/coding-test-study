// Solution 1
class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = n * m / gcd;
        return new int[]{gcd, lcm};
    }

    private static int getGcd(int n, int m) {
        if (n % m == 0) return m;
        return getGcd(m, n % m);
    }
}
/* 시간복잡도: O(log(min(n, m))) => (최악의 경우) n이나 m이 피보나치 수열의 두 연속된 수일 때, 최대 재귀 호출 수는 O(log(min(n, m))) */


// Solution 2 => 성능이 좀 더 안 좋음
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}
/* 시간복잡도: O(n + m) => 최대 공약수(GCD)와 최소 공배수(LCM)를 구하는 루프 횟수 */