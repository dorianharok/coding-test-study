public class No_12943 {
    public int solution(int num) {
        int answer = 0;

        long longNum = num;

        if (longNum == 1) {
            answer = 0;
            return answer;
        }

        for (int i = 0; i < 500; i++) {
            answer++;

            if(longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }

            if (longNum == 1) {
                return answer;
            }
        }

        answer = -1;
        return answer;
    }
}