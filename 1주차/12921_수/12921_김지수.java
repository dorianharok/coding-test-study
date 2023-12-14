// Solution 1
class Solution1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i ++) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }
        return answer;
    }
    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
/* 시간 초과! 시간복잡도: O(n^2) => 각 숫자에 대해 2부터 number-1까지 나누어보면서 소수 여부를 판별하기 때문에 */


// Solution 2
class Solution2 {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        int answer = 0;

        // 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j += i) { // 소수 i의 배수를 찾아서 false로
                    isPrime[j] = false;
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
/* 시간복잡도: O(n log(log n))
1. 초기화: isPrime 배열을 초기화하는 데 O(n)
2. 에라토스테네스의 체 알고리즘: 2부터 √n까지의 각 소수 i에 대해 i의 배수를 모두 지우는데 필요한 시간은 O(n/i)
                         총 √n개의 소수에 대해 이 작업을 수행하므로 전체 시간복잡도는 O(n * (1/2 + 1/3 + 1/5 + ... + 1/√n))
                         이 부분이 O(n log(log n))의 근사치
3. 소수 개수 세기: O(n)

=> 일반적으로 걸리는 시간: O(n) < O(n log(log n)) < O(nlogn)*/
