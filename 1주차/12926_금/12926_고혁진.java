class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                answer += " ";
                continue;
            }
            if(97<=c&&c<= 122) {
                if(c + n > 122) {
                    c = (char) ((c + n) - 26);
                } else {
                    c = (char) (c + n);
                }
            } else if(65<=c&&c<=90) {
                if(c + n > 90) {
                    c = (char) ((c + n) - 26);
                } else {
                    c = (char) (c + n);
                }
            }
            answer += c;
        }
        return answer;
    }
}