class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;

            while (count <= index) {
                c = (char) ('a' + (c - 'a' + 1) % 26);

                if (!skip.contains(String.valueOf(c))) {
                    count++;
                }
            }

            answer.append(c);
        }

        return answer.toString();
    }
}
