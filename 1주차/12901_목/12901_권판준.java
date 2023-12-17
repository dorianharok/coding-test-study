public class No_12901 {
    public String solution(int a, int b) {
        String answer = "";

        int days = 0;
        for (int i = 1; i < a; i++) {
            if (i == 2) {
                days += 29;
            } else if (i < 8) {
                if (i % 2 == 1) {
                    days += 31;
                } else {
                    days += 30;
                }
            } else {
                if (i % 2 == 1) {
                    days += 30;
                } else {
                    days += 31;
                }
            }
        }

        days += b - 1;

        switch (days % 7) {
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }

        return answer;
    }
}