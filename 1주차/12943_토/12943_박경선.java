class Solution {
    public int solution(int num) {
        int cnt = 0;
        int result = 0;
        long n = num;
        if( n == 1) return 0;
        while( cnt < 500 ){
            if(n % 2 == 0) n /= 2;
            else n = (n * 3 + 1);
            if(n == 1) {
                result++;
                break;
            }
            result++;
            cnt++;
        }
        if(cnt >= 500) return -1;
        return result;
    }
}
