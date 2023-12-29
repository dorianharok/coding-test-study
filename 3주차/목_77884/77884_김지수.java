// Solution 1
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            answer = cntDivisor(num) % 2 == 0? answer + num : answer - num;
        }
        return answer;
    }

    public int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) cnt++;
            else if (n % i == 0) cnt += 2;
        }
        return cnt;
    }
}


// Solution 2
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            else {
                answer += i;
            }
        }

        return answer;
    }
}