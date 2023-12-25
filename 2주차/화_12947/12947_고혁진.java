class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = x;
        int z = x;
        int n = 1;
        int sum = 0;
        while (x > 9) {
            x /= 10;
            n += 1;
        }
        for (int i = n-1; i >= 0; i--) {
            if(Math.pow(10,i)==0)
                continue;
            sum += y / Math.pow(10,i);
            y %= Math.pow(10,i);
        }
        if (z % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}