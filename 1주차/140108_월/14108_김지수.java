// Solution
class Solution {
    public int solution(String s) {
        // 글자 x 다음 x가 아닌 글자 글자 y가 나오면 바로 끊음
        // 글자 x 다음 x가 나오면 x 나온 횟수만큼 다른 글자 y들이 나오면 끊음

        int x = s.charAt(0);
        int countX = 0;
        int countY = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (countX == countY) {
                answer++;
                x = s.charAt(i);
            }
            if (s.charAt(i) == x) countX++;
            else countY++;
        }
        return answer;
    }
}

