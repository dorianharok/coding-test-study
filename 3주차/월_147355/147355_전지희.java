class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pValue = Integer.parseInt(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String substring = t.substring(i, i + p.length());
            int substringValue = Integer.parseInt(substring);

            if (substringValue <= pValue) {
                count++;
            }
        }

        return count;
    }
}
