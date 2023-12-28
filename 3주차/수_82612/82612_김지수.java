// Solution 1
class Solution {
    public long solution(int price, int money, int count) {
        long payment = 0;
        for (int i = 1; i <= count; i++) {
            payment += price * i;
        }
        return payment - money >= 0? payment - money : 0;
    }
}


// Solution 2
class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }
        return (answer > 0 ? 0 : -answer);
    }
}


// Solution 3
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = (long) price * count * (count+1) / 2 - money; // 수열의 합(시그마 공식)
        return answer <= 0 ? 0 : answer;
    }
}


// Solution 4
class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}