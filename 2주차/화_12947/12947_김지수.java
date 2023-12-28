// Solution 1
class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int copyX = x;
        while (copyX / 10 >= 0) {
            sum += copyX % 10;
            if (copyX / 10 == 0) break;
            copyX /= 10;
        }
        return x % sum == 0;
    }
}
/* 시간 복잡도: O(log(x)) => copyX를 10으로 나누는 것은 x의 자릿수에 대한 로그를 구하는 것과 동일 */


// Solution 2
class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}
/* 시간 복잡도: O(log(x)) => String.valueOf(x).chars()에서 문자열 길이인 log(x)에 대한 스트림 생성 후 map 및 sum 연산 */


// Solution 3
class Solution {
    public boolean solution(int x) {
        String[] tmp = String.valueOf(x).split("");
        int sum=0;
        for(String s:tmp) {
            sum+=Integer.parseInt(s);
        }
        if(x%sum==0) {
            return true;
        } else {
            return false;
        }
    }
}
/* 시간 복잡도: O(log(x)) => String.valueOf(x).split("")에서 문자열 길이인 log(x)에 대한 배열 생성 후 for 루프 */