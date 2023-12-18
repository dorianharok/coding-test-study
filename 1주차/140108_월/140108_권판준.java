public class No_140108 {
    public int solution(String s) {
        int answer = 0;

        while (s.length() != 0) {
            char x = s.charAt(0);
            int xCnt = 0;
            int yCnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (x == s.charAt(i)) {
                    xCnt++;
                } else {
                    yCnt++;
                }

                if (xCnt == yCnt || i == s.length() - 1) {
                    s = s.substring(i + 1, s.length());
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}