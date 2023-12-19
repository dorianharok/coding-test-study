// Solution 1
class Solution1 {
    public int solution(int n) {
        long num = n;
        int answer = 0;

        while (num != 1) {
            if (answer > 500) {
                return -1;
            } else if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
    // 1.5를 500승 하면 int의 범위인 2,147,483,647(약 21억)을 넘음 => int를 long으로 변환
}


// Solution 2
class Solution2 {
    public int solution(int num) {
        long n = (long)num;
        for(int i=0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}