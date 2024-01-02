public class No_147355 {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            int endIndex = i + p.length() > t.length() ? t.length() : i + p.length();

            String sub = t.substring(i, endIndex);
            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}