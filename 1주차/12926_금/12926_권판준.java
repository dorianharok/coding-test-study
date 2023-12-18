public class No_12926 {
    public String solution(String s, int n) {
        String answer = "";

        char[] cArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cArr) {
            if(c == ' ') {
                sb.append(c);
            }
            else if(c >= 'A' && c <= 'Z') {
                c += n;
                if(c > 'Z') {
                    c -= 26;
                }
                sb.append(c);
            }
            else if(c >= 'a' && c <= 'z') {
                c += n;
                if(c > 'z') {
                    c -= 26;
                }
                sb.append(c);
            }
        }

        answer = sb.toString();
        return answer;
    }
}