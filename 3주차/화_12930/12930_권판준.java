public class No_12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] wordArr = s.split(" ", -1);
        for (String word : wordArr) {
            if(word.length() == 0) {
                sb.append(" ");
                continue;
            }
            String[] c = word.split("");

            for (int i = 0; i < c.length; i++) {
                if (i % 2 == 0) {
                    c[i] = c[i].toUpperCase();
                } else {
                    c[i] = c[i].toLowerCase();
                }
                sb.append(c[i]);
            }

            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}