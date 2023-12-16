public class No_12912 {
    public long solution(int a, int b) { // 오답
        long answer = 0;

        answer = Math.abs(sum(a) - sum(b));
        if (a * b > 0) {
            answer += Math.abs(a) >= Math.abs(b) ? Math.abs(b) : Math.abs(a);
            answer = a > 0 ? answer : answer * -1;
        } else {
            answer = a + b > 0 ? answer : answer * -1;
        }

        return answer;
    }

    public int sum(int n) {
        n = Math.abs(n);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // https://ittrue.tistory.com/308
    public long solution2(int a, int b) {
        long x = Math.max(a, b);
        long y = Math.min(a, b);

        return (x - y + 1) * (x + y) / 2;
    }
}