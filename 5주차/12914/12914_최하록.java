class Solution {
    public long solution(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        long[] arr = new long[n+1];
        arr[1] = 1L;
        arr[2] = 2L;

        for(int i=3; i <= n; i++){
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }

        return arr[n];
    }
}