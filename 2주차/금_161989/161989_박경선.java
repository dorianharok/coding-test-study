// 풀이 참조
class Solution {
    public int solution(int n, int m, int[] section) { int answer = 0;
        int idx =0;
        for (int i : section) {
            if (i > idx) {
                answer++;
                idx = i + m -1; // 현재 인덱스부터 칠한 마지막칸 인데스
            }
        }

        return answer;
    }
}