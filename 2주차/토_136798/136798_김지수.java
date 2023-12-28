// Solution 1
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (cntDivisors(i) > limit) {
                answer += power;
            } else {
                answer += cntDivisors(i);
            }
        }
        return answer;
    }

    private static int cntDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }
        return count;
    }
}
/* 시간복잡도: O(number * √number) => cntDivisors 메소드의 시간 복잡도: O(√n) */


// Solution 2
class Solution {
    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}
/* 시간복잡도: O(number * number / i) = O(number^2) => i는 상수 계수이므로 제외, 가장 큰 차수의 항을 취함 */