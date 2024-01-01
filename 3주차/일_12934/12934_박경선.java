class Solution {
    public long solution(long n) {
        int sqrt = (int)Math.sqrt(n);
        if(n == Math.pow(sqrt,2)) return (long)Math.pow(sqrt+1,2);
        return -1;
    }
}