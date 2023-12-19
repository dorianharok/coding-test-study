public class No_12916 {
    boolean solution(String s) {

        String lower = s.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'p') {
                pCnt++;
            } else if (lower.charAt(i) == 'y') {
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}