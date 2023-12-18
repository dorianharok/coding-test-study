class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n;
        int b = m;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        answer[0] = gcd;

        int lcm = (n * m) / gcd;
        answer[1] = lcm;

        return answer;
    }
}
