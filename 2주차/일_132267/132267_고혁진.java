class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a){
            int bottle = (n / a) * b;
            n = (n % a) + bottle;
            answer += bottle;
        }

        return answer;
    }
}