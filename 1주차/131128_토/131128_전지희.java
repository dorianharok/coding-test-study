class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];

        for (char digit : X.toCharArray()) {
            x[digit - '0'] += 1;
        }

        for (char digit : Y.toCharArray()) {
            y[digit - '0'] += 1;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(x[i], y[i]); j++) {
                answer.append(i);
            }
        }

        if (answer.length() == 0) {
            return "-1";
        } else if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer.toString();
        }
    }
}
