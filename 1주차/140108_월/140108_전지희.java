class Solution {
    public int solution(String s) {
        int answer = 0;

        while (!s.isEmpty()) {
            char x = s.charAt(0);
            int xCount = 0;
            int otherCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }

                if (xCount == otherCount) {
                    answer++;
                    s = s.substring(i + 1);
                    break;
                }
            }

            if (xCount != otherCount) {
                answer++;
                break;
            }
        }
        return answer;
    }
}
