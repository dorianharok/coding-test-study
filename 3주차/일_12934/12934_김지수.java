// Solution 1
class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        return (long) (Math.pow(x + 1, 2) % 1 == 0 ? Math.pow(x + 1, 2) : -1);
    }
}


// Solution 2
class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        return Math.floor(x) == x ? (long) Math.pow(x + 1, 2) : -1;
    }
}


// Solution 3
class Solution {
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}