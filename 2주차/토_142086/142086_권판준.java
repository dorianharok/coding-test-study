public class No_142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int pos = s.substring(0, i).lastIndexOf(String.valueOf(s.charAt(i)));
            if (pos == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - pos;
            }
        }

        return answer;
    }
}