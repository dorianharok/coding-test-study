class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer.append((char) ('A' + (ch - 'A' + n) % 26));
            } else if (Character.isLowerCase(ch)) {
                answer.append((char) ('a' + (ch - 'a' + n) % 26));
            } else {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}
