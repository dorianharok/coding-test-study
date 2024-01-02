class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int currentIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                currentIdx++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[currentIdx] = 10;
                    i++;
                } else {
                    scores[currentIdx] = c - '0';
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') {
                    scores[currentIdx] = (int) Math.pow(scores[currentIdx], 2);
                } else if (c == 'T') {
                    scores[currentIdx] = (int) Math.pow(scores[currentIdx], 3);
                }
            } else if (c == '*' || c == '#') {
                if (c == '*') {
                    scores[currentIdx] *= 2;
                    if (currentIdx > 0) {
                        scores[currentIdx - 1] *= 2;
                    }
                } else {
                    scores[currentIdx] *= -1;
                }
            }
        }

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        return totalScore;
    }
}
