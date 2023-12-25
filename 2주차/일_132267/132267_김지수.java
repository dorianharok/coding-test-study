// Solution 1
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;

        while (n >= b) {
            if (n < a && rest == 0) break;
            if (n < a && rest != 0) {
                n += rest;
                rest = 0;
            }
            if (n % a != 0) {
                rest += n % a;
            }
            n = n / a * b;
            answer += n;
        }
        return answer;
    }
}


// Solution 2
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }gi

        return answer;
    }
}