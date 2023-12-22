public class No_12940 {
    public int[] solution(int n, int m) {
        int gcd = findGCD(n, m);
        int lcm = findLCM(n, m);

        return new int[] {gcd, lcm};
    }

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int findLCM(int a, int b) {
        return a * b / findGCD(a, b);
    }
}