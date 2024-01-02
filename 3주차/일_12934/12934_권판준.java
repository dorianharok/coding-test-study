public class No_12934 {
    public long solution(long n) {
        double x = Math.ceil(Math.sqrt(n));
        if (Math.pow(x, 2) == n) {
            return (long) Math.pow(x + 1, 2);
        } else {
            return -1;
        }
    }
}