class Solution {
    public int solution(String s) {
        int answer = 0;
        int x = 0, y = 0;
        char ch = s.charAt(0);

        for(int i=0; i<s.length(); i++) {
            if(x==y) {
                answer++;
                ch = s.charAt(i);
            }

            if(ch == s.charAt(i)) {
                x++;
            }
            else {
                y++;
            }
        }
        return answer;
    }
}