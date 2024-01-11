// Solution 1
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long) x * i;
        }
        return answer;
    }
}


// Solution 2
import java.util.stream.LongStream;
class Solution {
    public long[] solution(int x, int n) {
        return LongStream.iterate(x, i -> i + x).limit(n).toArray(); // LongStream.iterate(x, i -> i + x): x부터 시작하여 i를 x씩 증가시키는 무한 스트림을 생성
    }
}