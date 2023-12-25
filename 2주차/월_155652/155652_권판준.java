public class No_155652 {
    public String solution(String s, String skip, int index) {
        char[] cArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cArr.length; i++) {
            int idx = index;
            for (int j = 1; j <= idx; j++) {
                char c = (char) (cArr[i] + (j % 26));
                if(c > 'z') {
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))) {
                    idx++;
                }
            }
            char c2 = (char) (cArr[i] + (idx % 26));
            if(c2 > 'z') {
                c2 -= 26;
            }
            sb.append(c2);
        }

        return sb.toString();
    }
}