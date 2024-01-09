// Solution 1 범위 유의할 것! long으로 안 해 주면 런타인 에러 남
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long longP = Long.parseLong(p);
        for (int i = 0; i <= (t.length() - p.length()); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= longP)
                answer++;
        }
        return answer;
    }
}