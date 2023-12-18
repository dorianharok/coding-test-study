class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = cal(n,m);
        answer[1] = n*m / answer[0];
        return answer;
    }
    private static int cal(int n, int m){
        if(m == 0) return n;
        return cal(m,n % m);
    }
}