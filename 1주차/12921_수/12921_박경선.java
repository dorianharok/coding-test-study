class Solution {
    public int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++){
            // 2의 배수, 3의 배수, 5의 배수, 7의 배수 지워가
            // 에라토스테네스의 체
            if(arr[i] == 0){
                cnt++;
                for(int j=i; j<=n; j+=i){
                    arr[j] = 1;
                }
            }
        }
        return cnt;
    }
}