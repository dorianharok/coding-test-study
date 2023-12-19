public class No_133499 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] cooing = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            for (int i = 0; i < cooing.length; i++) {
                if (b.contains(cooing[i])) {
                    b = b.replaceAll(cooing[i], String.valueOf(i));
                }
            }

            boolean flag = true;
            for (int i = 0; i < b.length(); i++) {
                if (!Character.isDigit(b.charAt(i))) {
                    flag = false;
                    break;
                }

                int j = i+1;
                if(j != b.length() && b.charAt(i) == b.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}