class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        int mid = len / 2;

        answer = len % 2 == 0 ? s.substring(mid - 1, mid + 1) : s.substring(mid, mid + 1);
        return answer;
    }
}
