//class Solution {
//    public int solution(int n) {
//        int answer = 1;
//        int k = 0;
//        for(int i=3; i<=n; i++){
//            k=0;
//            for(int j=2; j<=i-1; j++){
//                if((i%j)!=0){
//                    k++;
//                }
//            } if(k==i-2){
//                answer+=1;
//            }
//        }
//        return answer;
//    }
//}
//1차시도 시간초과
class Solution {
    public int solution(int n) {
        int answer=0;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i])
            {
                answer++;
            }
        }
        return answer;
    }
}

