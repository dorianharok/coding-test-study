class Solution {
    public boolean solution(String s) {
        boolean answer = s.matches("[0-9]{4}|[0-9]{6}");
        return answer;
    }
}
